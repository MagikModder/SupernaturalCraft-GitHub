package com.sterango.spncraft.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class HeavenCobblestoneBlock extends Block {

	private String name = "heavencobblestone";

	public HeavenCobblestoneBlock(){
		
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(3.F);
		this.setResistance(10.F);
		GameRegistry.registerBlock(this, name);
		this.setHarvestLevel("pickaxe", 3);
		
		
	}
	
}
