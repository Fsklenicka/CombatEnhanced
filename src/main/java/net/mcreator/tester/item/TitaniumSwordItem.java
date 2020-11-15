
package net.mcreator.tester.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.tester.itemgroup.EnhancedcombatItemGroup;
import net.mcreator.tester.TesterModElements;

@TesterModElements.ModElement.Tag
public class TitaniumSwordItem extends TesterModElements.ModElement {
	@ObjectHolder("tester:titanium_sword")
	public static final Item block = null;
	public TitaniumSwordItem(TesterModElements instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 2.5f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TitaniumIngotItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(EnhancedcombatItemGroup.tab)) {
		}.setRegistryName("titanium_sword"));
	}
}
