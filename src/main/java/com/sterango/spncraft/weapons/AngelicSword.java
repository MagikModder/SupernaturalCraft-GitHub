package com.sterango.spncraft.weapons;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class AngelicSword extends ItemSword{

	public AngelicSword(int i, ToolMaterial angelic) {
		super(angelic);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setUnlocalizedName("AngelicSword");
		setTextureName("supernaturalcraft:angel_blade");
	}

}
