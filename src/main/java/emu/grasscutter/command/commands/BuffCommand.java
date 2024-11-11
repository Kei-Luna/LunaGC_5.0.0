package emu.grasscutter.command.commands;

import emu.grasscutter.command.*;
import emu.grasscutter.data.GameData;
import emu.grasscutter.game.player.Player;
import java.util.List;
import java.util.stream.Collectors;

@Command(
        label = "buff",
        usage = {"[[-]<buffId>]"},
        permission = "player.heal",
        permissionTargeted = "player.heal.others")
public final class BuffCommand implements CommandHandler {
    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        var buffManager = targetPlayer.getBuffManager();
        if (args.size() < 1) {
            var buffs = buffManager.getBuffs();
            CommandHandler.sendTranslatedMessage(sender, "commands.buff.info", buffs.size());
            CommandHandler.sendMessage(sender,
                buffs.values().stream().map(b -> b.toString()).collect(Collectors.joining("\n")));
            return;
        }
        int buffId = 0, id = 0;
        try {
            buffId = Integer.parseInt(args.get(0));
        } catch (NumberFormatException e) {}
        if (buffId == 0) {
            sendUsageMessage(sender);
            return;
        } else if (buffId > 0) {
            boolean successed = buffManager.addBuff(buffId, 0f,
                targetPlayer.getAvatars().getAvatarById(targetPlayer.getMainCharacterId()));
            var buffData = GameData.getBuffDataMap().get(buffId);
            id = buffData.getGroupId();
            if (successed) {
                if (id == 0) id = buffId;
                var buff = buffManager.getBuffs().get(id);
                CommandHandler.sendTranslatedMessage(sender, "commands.buff.add_buff", buff);
            }
        }
        else {
            if (id == 0) id = -buffId;
            var buffData = GameData.getBuffDataMap().get(-buffId);
            id = buffData.getGroupId();
            boolean successed = buffManager.removeBuff(id);
            if (successed) {
                CommandHandler.sendTranslatedMessage(sender, "commands.buff.remove_buff", -buffId);
            }
        }
    }
}
