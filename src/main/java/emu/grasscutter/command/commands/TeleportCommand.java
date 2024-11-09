package emu.grasscutter.command.commands;

import static emu.grasscutter.utils.lang.Language.translate;

import emu.grasscutter.command.*;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.world.Position;
import emu.grasscutter.server.event.player.PlayerTeleportEvent.TeleportType;
import java.util.List;

@Command(
        label = "teleport",
        aliases = {"tp"},
        usage = {"<x> <y> <z> [sceneId]", "<distance> [slope=0.5]"},
        permission = "player.teleport",
        permissionTargeted = "player.teleport.others")
public final class TeleportCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        Position pos = new Position(targetPlayer.getPosition());
        Position rot = new Position(targetPlayer.getRotation());
        int sceneId = targetPlayer.getSceneId();
        float slope = .5f;

        switch (args.size()) {
            case 4:
                try {
                    sceneId = Integer.parseInt(args.get(3));
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(
                            sender, translate(sender, "commands.execution.argument_error"));
                } // Fallthrough
            case 3:
                try {
                    pos = CommandHelpers.parsePosition(args.get(0), args.get(1), args.get(2), pos, rot);
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendMessage(
                            sender, translate(sender, "commands.teleport.invalid_position"));
                }
                break;
            case 2:
                slope = Float.parseFloat(args.get(1));
            case 1:
                float dist = Float.parseFloat(args.get(0));
                float angle = (float) Math.toRadians(rot.getY());
                float dx = dist * (float) Math.sin(angle);
                float dz = dist * (float) Math.cos(angle);
                float dy = dist * slope;
                pos = pos.add(new Position(dx, dy, dz));
                break;
            default:
                this.sendUsageMessage(sender);
                return;
        }

        boolean result =
                targetPlayer
                        .getWorld()
                        .transferPlayerToScene(targetPlayer, sceneId, TeleportType.COMMAND, pos);

        if (!result) {
            CommandHandler.sendMessage(sender, translate(sender, "commands.teleport.exists_error"));
        } else {
            CommandHandler.sendMessage(
                    sender,
                    translate(
                            sender,
                            "commands.teleport.success",
                            targetPlayer.getNickname(),
                            pos.getX(),
                            pos.getY(),
                            pos.getZ(),
                            sceneId));
        }
    }
}
