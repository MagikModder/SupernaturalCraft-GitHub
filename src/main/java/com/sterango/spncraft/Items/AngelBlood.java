package com.sterango.spncraft.Items;

import com.sterango.spncraft.SupernaturalCraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class AngelBlood extends Item
{
    private static final String __OBFID = "CL_00000048";

    public AngelBlood()
    {
        this.setMaxStackSize(1);
    
    }

    public ItemStack onEaten(ItemStack item, World world, EntityPlayer player)
    {
        if (!player.capabilities.isCreativeMode)
        {
            --item.stackSize;
        }

        if (!world.isRemote)
        {
        	player.addPotionEffect(new PotionEffect(Potion.heal.id, 140, 200));
        	player.addPotionEffect(new PotionEffect(Potion.resistance.id, 140, 200));
        	player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 140, 200));
        }

        return item.stackSize <= 0 ? new ItemStack(SupernaturalCraft.AngelBlood) : item;
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 32;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack p_77661_1_)
    {
        return EnumAction.drink;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {
        p_77659_3_.setItemInUse(p_77659_1_, this.getMaxItemUseDuration(p_77659_1_));
        return p_77659_1_;
    }
}