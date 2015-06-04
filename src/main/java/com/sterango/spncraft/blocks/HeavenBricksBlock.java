package com.sterango.spncraft.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class HeavenBricksBlock extends Block {

	private String name = "heavenbricks";

	public HeavenBricksBlock(){
		
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(3.F);
		this.setResistance(10.F);
		GameRegistry.registerBlock(this, name);
		setBlockTextureName("supernaturalcraft:heaven_bricks");
		this.setHarvestLevel("pickaxe", 3);
		
		
	}
	
}
