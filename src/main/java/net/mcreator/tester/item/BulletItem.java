
package net.mcreator.tester.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.tester.itemgroup.EnhancedcombatItemGroup;
import net.mcreator.tester.TesterModElements;

@TesterModElements.ModElement.Tag
public class BulletItem extends TesterModElements.ModElement {
	@ObjectHolder("tester:bullet")
	public static final Item block = null;
	public BulletItem(TesterModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(EnhancedcombatItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON));
			setRegistryName("bullet");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 0F;
		}
	}
}
