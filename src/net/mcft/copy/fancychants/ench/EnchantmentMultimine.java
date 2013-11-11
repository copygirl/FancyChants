package net.mcft.copy.fancychants.ench;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;

public class EnchantmentMultimine extends Enchantment {
	
	protected EnchantmentMultimine(int id, int weight) {
		super(id, weight, EnumEnchantmentType.digger);
		setName("multimine");
	}
	
	@Override
	public int getMaxLevel() { return 2; }
	
	@Override
	public int getMinEnchantability(int level) { return ((level == 1) ? 20 : 30); }
	
	@Override
	public int getMaxEnchantability(int level) { return ((level == 1) ? 30 : 80); }
	
}
