
package net.mcreator.tester.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.tester.item.HammerItem;
import net.mcreator.tester.TesterModElements;

@TesterModElements.ModElement.Tag
public class EnhancedcombatItemGroup extends TesterModElements.ModElement {
	public EnhancedcombatItemGroup(TesterModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabenhancedcombat") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(HammerItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
