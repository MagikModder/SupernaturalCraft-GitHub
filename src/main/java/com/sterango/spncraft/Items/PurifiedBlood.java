package com.sterango.spncraft.Items;

import com.sterango.spncraft.SupernaturalCraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PurifiedBlood extends Item
{
	public PurifiedBlood()
	{
	super();
	this.setMaxStackSize(1);
	}

    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    if (!par3EntityPlayer.capabilities.isCreativeMode)
    {
    --par1ItemStack.stackSize;
    }

    if (!par2World.isRemote)
    {
    par3EntityPlayer.curePotionEffects(par1ItemStack);
    }

    return par1ItemStack.stackSize <= 0 ? new ItemStack(SupernaturalCraft.PurifiedBlood) : par1ItemStack;
    }

    /**
    * How long it takes to use or consume an item
    */
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
    return 32;
    }

    /**
    * returns the action that specifies what animation to play when the items is being used
    */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
    return EnumAction.drink;
    }

    /**
    * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
    */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
    return par1ItemStack;
    }
    }