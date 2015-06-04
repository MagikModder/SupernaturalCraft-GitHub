package com.sterango.spncraft.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import com.sterango.spncraft.SupernaturalCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Direction;
import net.minecraft.util.IIcon;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Salt extends Block
{

	private boolean field_150181_a = true;
    private Set field_150179_b = new HashSet();
    @SideOnly(Side.CLIENT)
    private IIcon field_150182_M;
    @SideOnly(Side.CLIENT)
    private IIcon field_150183_N;
    @SideOnly(Side.CLIENT)
    private IIcon field_150184_O;
    @SideOnly(Side.CLIENT)
    private IIcon field_150180_P;
    private static final String __OBFID = "CL_00000295";

    public Salt()
    {
        super(Material.circuits);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return null;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 0;
    }

    /**
     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     * when first determining what to render.
     */
    @SideOnly(Side.CLIENT)
   

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World p_149742_1_, int p_149742_2_, int p_149742_3_, int p_149742_4_)
    {
        return World.doesBlockHaveSolidTopSurface(p_149742_1_, p_149742_2_, p_149742_3_ - 1, p_149742_4_) || p_149742_1_.getBlock(p_149742_2_, p_149742_3_ - 1, p_149742_4_) == Blocks.glowstone;
    }

    private void func_150177_e(World p_150177_1_, int p_150177_2_, int p_150177_3_, int p_150177_4_)
    {
        this.func_150175_a(p_150177_1_, p_150177_2_, p_150177_3_, p_150177_4_, p_150177_2_, p_150177_3_, p_150177_4_);
        ArrayList arraylist = new ArrayList(this.field_150179_b);
        this.field_150179_b.clear();

        for (int l = 0; l < arraylist.size(); ++l)
        {
            ChunkPosition chunkposition = (ChunkPosition)arraylist.get(l);
            p_150177_1_.notifyBlocksOfNeighborChange(chunkposition.chunkPosX, chunkposition.chunkPosY, chunkposition.chunkPosZ, this);
        }
    }

    private void func_150175_a(World p_150175_1_, int p_150175_2_, int p_150175_3_, int p_150175_4_, int p_150175_5_, int p_150175_6_, int p_150175_7_)
    {
        int k1 = p_150175_1_.getBlockMetadata(p_150175_2_, p_150175_3_, p_150175_4_);
        byte b0 = 0;
        int i3 = this.func_150178_a(p_150175_1_, p_150175_5_, p_150175_6_, p_150175_7_, b0);
        this.field_150181_a = false;
        int l1 = p_150175_1_.getStrongestIndirectPower(p_150175_2_, p_150175_3_, p_150175_4_);
        this.field_150181_a = true;

        if (l1 > 0 && l1 > i3 - 1)
        {
            i3 = l1;
        }

        int i2 = 0;

        for (int j2 = 0; j2 < 4; ++j2)
        {
            int k2 = p_150175_2_;
            int l2 = p_150175_4_;

            if (j2 == 0)
            {
                k2 = p_150175_2_ - 1;
            }

            if (j2 == 1)
            {
                ++k2;
            }

            if (j2 == 2)
            {
                l2 = p_150175_4_ - 1;
            }

            if (j2 == 3)
            {
                ++l2;
            }

            if (k2 != p_150175_5_ || l2 != p_150175_7_)
            {
                i2 = this.func_150178_a(p_150175_1_, k2, p_150175_3_, l2, i2);
            }

            if (p_150175_1_.getBlock(k2, p_150175_3_, l2).isNormalCube() && !p_150175_1_.getBlock(p_150175_2_, p_150175_3_ + 1, p_150175_4_).isNormalCube())
            {
                if ((k2 != p_150175_5_ || l2 != p_150175_7_) && p_150175_3_ >= p_150175_6_)
                {
                    i2 = this.func_150178_a(p_150175_1_, k2, p_150175_3_ + 1, l2, i2);
                }
            }
            else if (!p_150175_1_.getBlock(k2, p_150175_3_, l2).isNormalCube() && (k2 != p_150175_5_ || l2 != p_150175_7_) && p_150175_3_ <= p_150175_6_)
            {
                i2 = this.func_150178_a(p_150175_1_, k2, p_150175_3_ - 1, l2, i2);
            }
        }

        if (i2 > i3)
        {
            i3 = i2 - 1;
        }
        else if (i3 > 0)
        {
            --i3;
        }
        else
        {
            i3 = 0;
        }

        if (l1 > i3 - 1)
        {
            i3 = l1;
        }

        if (k1 != i3)
        {
            p_150175_1_.setBlockMetadataWithNotify(p_150175_2_, p_150175_3_, p_150175_4_, i3, 2);
            this.field_150179_b.add(new ChunkPosition(p_150175_2_, p_150175_3_, p_150175_4_));
            this.field_150179_b.add(new ChunkPosition(p_150175_2_ - 1, p_150175_3_, p_150175_4_));
            this.field_150179_b.add(new ChunkPosition(p_150175_2_ + 1, p_150175_3_, p_150175_4_));
            this.field_150179_b.add(new ChunkPosition(p_150175_2_, p_150175_3_ - 1, p_150175_4_));
            this.field_150179_b.add(new ChunkPosition(p_150175_2_, p_150175_3_ + 1, p_150175_4_));
            this.field_150179_b.add(new ChunkPosition(p_150175_2_, p_150175_3_, p_150175_4_ - 1));
            this.field_150179_b.add(new ChunkPosition(p_150175_2_, p_150175_3_, p_150175_4_ + 1));
        }
    }

    private void func_150172_m(World p_150172_1_, int p_150172_2_, int p_150172_3_, int p_150172_4_)
    {
        if (p_150172_1_.getBlock(p_150172_2_, p_150172_3_, p_150172_4_) == this)
        {
            p_150172_1_.notifyBlocksOfNeighborChange(p_150172_2_, p_150172_3_, p_150172_4_, this);
            p_150172_1_.notifyBlocksOfNeighborChange(p_150172_2_ - 1, p_150172_3_, p_150172_4_, this);
            p_150172_1_.notifyBlocksOfNeighborChange(p_150172_2_ + 1, p_150172_3_, p_150172_4_, this);
            p_150172_1_.notifyBlocksOfNeighborChange(p_150172_2_, p_150172_3_, p_150172_4_ - 1, this);
            p_150172_1_.notifyBlocksOfNeighborChange(p_150172_2_, p_150172_3_, p_150172_4_ + 1, this);
            p_150172_1_.notifyBlocksOfNeighborChange(p_150172_2_, p_150172_3_ - 1, p_150172_4_, this);
            p_150172_1_.notifyBlocksOfNeighborChange(p_150172_2_, p_150172_3_ + 1, p_150172_4_, this);
        }
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World p_149726_1_, int p_149726_2_, int p_149726_3_, int p_149726_4_)
    {
        super.onBlockAdded(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_);

        if (!p_149726_1_.isRemote)
        {
            this.func_150177_e(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_);
            p_149726_1_.notifyBlocksOfNeighborChange(p_149726_2_, p_149726_3_ + 1, p_149726_4_, this);
            p_149726_1_.notifyBlocksOfNeighborChange(p_149726_2_, p_149726_3_ - 1, p_149726_4_, this);
            this.func_150172_m(p_149726_1_, p_149726_2_ - 1, p_149726_3_, p_149726_4_);
            this.func_150172_m(p_149726_1_, p_149726_2_ + 1, p_149726_3_, p_149726_4_);
            this.func_150172_m(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_ - 1);
            this.func_150172_m(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_ + 1);

            if (p_149726_1_.getBlock(p_149726_2_ - 1, p_149726_3_, p_149726_4_).isNormalCube())
            {
                this.func_150172_m(p_149726_1_, p_149726_2_ - 1, p_149726_3_ + 1, p_149726_4_);
            }
            else
            {
                this.func_150172_m(p_149726_1_, p_149726_2_ - 1, p_149726_3_ - 1, p_149726_4_);
            }

            if (p_149726_1_.getBlock(p_149726_2_ + 1, p_149726_3_, p_149726_4_).isNormalCube())
            {
                this.func_150172_m(p_149726_1_, p_149726_2_ + 1, p_149726_3_ + 1, p_149726_4_);
            }
            else
            {
                this.func_150172_m(p_149726_1_, p_149726_2_ + 1, p_149726_3_ - 1, p_149726_4_);
            }

            if (p_149726_1_.getBlock(p_149726_2_, p_149726_3_, p_149726_4_ - 1).isNormalCube())
            {
                this.func_150172_m(p_149726_1_, p_149726_2_, p_149726_3_ + 1, p_149726_4_ - 1);
            }
            else
            {
                this.func_150172_m(p_149726_1_, p_149726_2_, p_149726_3_ - 1, p_149726_4_ - 1);
            }

            if (p_149726_1_.getBlock(p_149726_2_, p_149726_3_, p_149726_4_ + 1).isNormalCube())
            {
                this.func_150172_m(p_149726_1_, p_149726_2_, p_149726_3_ + 1, p_149726_4_ + 1);
            }
            else
            {
                this.func_150172_m(p_149726_1_, p_149726_2_, p_149726_3_ - 1, p_149726_4_ + 1);
            }
        }
    }

    public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_)
    {
        super.breakBlock(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_, p_149749_6_);

        if (!p_149749_1_.isRemote)
        {
            p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_, p_149749_3_ + 1, p_149749_4_, this);
            p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_, p_149749_3_ - 1, p_149749_4_, this);
            p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_ + 1, p_149749_3_, p_149749_4_, this);
            p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_ - 1, p_149749_3_, p_149749_4_, this);
            p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_, p_149749_3_, p_149749_4_ + 1, this);
            p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_, p_149749_3_, p_149749_4_ - 1, this);
            this.func_150177_e(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_);
            this.func_150172_m(p_149749_1_, p_149749_2_ - 1, p_149749_3_, p_149749_4_);
            this.func_150172_m(p_149749_1_, p_149749_2_ + 1, p_149749_3_, p_149749_4_);
            this.func_150172_m(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_ - 1);
            this.func_150172_m(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_ + 1);

            if (p_149749_1_.getBlock(p_149749_2_ - 1, p_149749_3_, p_149749_4_).isNormalCube())
            {
                this.func_150172_m(p_149749_1_, p_149749_2_ - 1, p_149749_3_ + 1, p_149749_4_);
            }
            else
            {
                this.func_150172_m(p_149749_1_, p_149749_2_ - 1, p_149749_3_ - 1, p_149749_4_);
            }

            if (p_149749_1_.getBlock(p_149749_2_ + 1, p_149749_3_, p_149749_4_).isNormalCube())
            {
                this.func_150172_m(p_149749_1_, p_149749_2_ + 1, p_149749_3_ + 1, p_149749_4_);
            }
            else
            {
                this.func_150172_m(p_149749_1_, p_149749_2_ + 1, p_149749_3_ - 1, p_149749_4_);
            }

            if (p_149749_1_.getBlock(p_149749_2_, p_149749_3_, p_149749_4_ - 1).isNormalCube())
            {
                this.func_150172_m(p_149749_1_, p_149749_2_, p_149749_3_ + 1, p_149749_4_ - 1);
            }
            else
            {
                this.func_150172_m(p_149749_1_, p_149749_2_, p_149749_3_ - 1, p_149749_4_ - 1);
            }

            if (p_149749_1_.getBlock(p_149749_2_, p_149749_3_, p_149749_4_ + 1).isNormalCube())
            {
                this.func_150172_m(p_149749_1_, p_149749_2_, p_149749_3_ + 1, p_149749_4_ + 1);
            }
            else
            {
                this.func_150172_m(p_149749_1_, p_149749_2_, p_149749_3_ - 1, p_149749_4_ + 1);
            }
        }
    }

    private int func_150178_a(World p_150178_1_, int p_150178_2_, int p_150178_3_, int p_150178_4_, int p_150178_5_)
    {
        if (p_150178_1_.getBlock(p_150178_2_, p_150178_3_, p_150178_4_) != this)
        {
            return p_150178_5_;
        }
        else
        {
            int i1 = p_150178_1_.getBlockMetadata(p_150178_2_, p_150178_3_, p_150178_4_);
            return i1 > p_150178_5_ ? i1 : p_150178_5_;
        }
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return SupernaturalCraft.Salt;
    }

   
    @SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
        return SupernaturalCraft.Salt;
    }

   

    
}

  
