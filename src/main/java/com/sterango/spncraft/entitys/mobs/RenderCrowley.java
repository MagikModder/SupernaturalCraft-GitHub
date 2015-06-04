package com.sterango.spncraft.Common.entitys.mobs;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.sterango.spncraft.main.SupernaturalCraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCrowley extends RenderBiped
{
	private static final ResourceLocation textureLocation = new ResourceLocation(SupernaturalCraft.MODID + ":" + "textures/entity/Crowley.png");    /** Iron Golem's Model. */
    private static final ResourceLocation witherSkeletonTextures = new ResourceLocation(SupernaturalCraft.MODID + ":" + "textures/entity/Crowley.png");
    private static final String __OBFID = "CL_00001023";

    public RenderCrowley(ModelBiped modelBiped, float f)
    {
        super(new ModelBiped(), 0.5F);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityCrowley par1EntityCrowley, float par2)
    {
        if (par1EntityCrowley.getSkeletonType() == 1)
        {
            GL11.glScalef(1.2F, 1.2F, 1.2F);
        }
    }

    protected void func_82422_c()
    {
        GL11.glTranslatef(0.09375F, 0.1875F, 0.0F);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityCrowley par1EntityCrowley)
    {
        return par1EntityCrowley.getSkeletonType() == 1 ? witherSkeletonTextures : textureLocation;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityLiving par1EntityLiving)
    {
        return this.getEntityTexture((EntityCrowley)par1EntityLiving);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.preRenderCallback((EntityCrowley)par1EntityLivingBase, par2);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityCrowley)par1Entity);
    }
}