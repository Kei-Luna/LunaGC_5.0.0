package emu.grasscutter.game.ability.actions;

import com.google.protobuf.ByteString;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.binout.AbilityModifier.AbilityModifierAction;
import emu.grasscutter.game.ability.Ability;
import emu.grasscutter.game.ability.AbilityManager;
import emu.grasscutter.game.ability.AbilityModifierController;
import emu.grasscutter.game.entity.GameEntity;

@AbilityAction(AbilityModifierAction.Type.ApplyModifier)
public final class ActionApplyModifier extends AbilityActionHandler {
    @Override
    public boolean execute(
            Ability ability, AbilityModifierAction action, ByteString abilityData, GameEntity target) {
        var modifierData = ability.getData().modifiers.get(action.modifierName);
        if (modifierData == null) {
            Grasscutter.getLogger().debug("Modifier {} not found", action.modifierName);
            return false;
        }

        if (modifierData.stacking != null && modifierData.stacking.compareTo("Unique") == 0 &&
            ability.getModifiers().values().stream().filter(m ->
                m.getModifierData().equals(modifierData)).count() != 0) {
            return true;
        }

        // TODO: Check predicates before executing all of these actions

        AbilityModifierController modifier = new AbilityModifierController(ability, ability.getData(), modifierData);
        ability.getModifiers().put(action.modifierName, modifier);
        for (var a : modifierData.onAdded)
            this.abilityManager.executeAction(ability, a, abilityData, target);

        return true;
    }
}
