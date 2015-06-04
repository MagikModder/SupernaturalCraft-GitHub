package com.sterango.spncraft.main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CreativeTabsSupernaturalCraft extends CreativeTabs {

public CreativeTabsSupernaturalCraft(String tabLabel)
{
super(tabLabel);
}

@Override
@SideOnly(Side.CLIENT)
public Item getTabIconItem()
{
return SupernaturalCraft.AntiPossessionTattoo;
}

}