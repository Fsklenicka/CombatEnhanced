package net.mcreator.tester.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.tester.item.HulksPotionItem;
import net.mcreator.tester.TesterModElements;

import java.util.Map;

@TesterModElements.ModElement.Tag
public class HulksBloodPotionStartedappliedProcedure extends TesterModElements.ModElement {
	public HulksBloodPotionStartedappliedProcedure(TesterModElements instance) {
		super(instance, 46);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure HulksBloodPotionStartedapplied!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 2500, (int) 3, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 550, (int) 10, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 450, (int) 4, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 1000, (int) 8, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, (int) 1000, (int) 8, (false), (false)));
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(HulksPotionItem.block, (int) (1));
			((PlayerEntity) entity).inventory.clearMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (int) 1);
		}
	}
}
