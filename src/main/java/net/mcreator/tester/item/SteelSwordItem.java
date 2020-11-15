
package net.mcreator.tester.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import net.mcreator.tester.itemgroup.EnhancedcombatItemGroup;
import net.mcreator.tester.TesterModElements;

@TesterModElements.ModElement.Tag
public class SteelSwordItem extends TesterModElements.ModElement {
	@ObjectHolder("tester:steel_sword")
	public static final Item block = null;
	public SteelSwordItem(TesterModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 750;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 2.5f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.IRON_BLOCK, (int) (1)));
			}
		}, 3, -2.2999999999999998f, new Item.Properties().group(EnhancedcombatItemGroup.tab)) {
		}.setRegistryName("steel_sword"));
	}
}
