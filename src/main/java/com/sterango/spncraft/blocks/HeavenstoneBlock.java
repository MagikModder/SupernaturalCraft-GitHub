package com.sterango.spncraft.blocks;

import java.util.Random;

import com.sterango.spncraft.SupernaturalCraft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HeavenstoneBlock extends Block {

	private String name = "heavenstone";

	
	public HeavenstoneBlock(){
		
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(3.F);
		this.setResistance(10.F);
		GameRegistry.registerBlock(this, name);
		this.setHarvestLevel("pickaxe", 3);
			
	}
	
}