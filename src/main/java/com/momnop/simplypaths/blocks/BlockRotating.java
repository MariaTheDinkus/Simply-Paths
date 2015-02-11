package com.momnop.simplypaths.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.momnop.simplypaths.SimplyPathsCreativeTab;
import com.momnop.simplypaths.info.ModInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRotating extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon pathTop0;
	@SideOnly(Side.CLIENT)
	private IIcon pathTop1;
	@SideOnly(Side.CLIENT)
	private IIcon pathTop2;
	@SideOnly(Side.CLIENT)
	private IIcon pathTop3;
	
	private String nameTexture;
	private String nameSide;

	public BlockRotating(Material material, String unlocalizedName, String soundType,
			float hardness, int harvestLevel, String toolType, String textureName, String textureSide) {
		super(material);
		setCreativeTab(SimplyPathsCreativeTab.INSTANCE);
		setLightOpacity(255);
		setHardness(hardness);
		setHarvestLevel(toolType, harvestLevel);
		setBlockName(unlocalizedName);
		useNeighborBrightness = true;
		nameTexture = textureName;
		nameSide = textureSide;

		if (soundType == "gravel") {
			setStepSound(soundTypeGravel);
		} else if (soundType == "stone") {
			setStepSound(soundTypeStone);
		} else if (soundType == "wool") {
			setStepSound(soundTypeCloth);
		} else if (soundType == "glass") {
			setStepSound(soundTypeGlass);
		} else if (soundType == "grass") {
			setStepSound(soundTypeGrass);
		} else if (soundType == "anvil") {
			setStepSound(soundTypeAnvil);
		} else if (soundType == "ladder") {
			setStepSound(soundTypeLadder);
		} else if (soundType == "metal") {
			setStepSound(soundTypeMetal);
		} else if (soundType == "piston") {
			setStepSound(soundTypePiston);
		} else if (soundType == "wood") {
			setStepSound(soundTypeWood);
		} else if (soundType == "sand") {
			setStepSound(soundTypeSand);
		} else if (soundType == "snow") {
			setStepSound(soundTypeSnow);
		} else {

		}
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	/**
	 * Gets the block's texture. Args: side, meta
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta) {
		if (meta == 0 && side == 1)
			return pathTop0;
		if (meta == 1 && side == 1)
			return pathTop1;
		if (meta == 2 && side == 1)
			return pathTop2;
		if (meta == 3 && side == 1)
			return pathTop3;
		return blockIcon;
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register) {
		this.blockIcon = register.registerIcon(ModInfo.MODID + ":"
				+ nameSide);
		this.pathTop0 = register.registerIcon(ModInfo.MODID + ":"
				+ nameTexture + "_top0");
		this.pathTop1 = register.registerIcon(ModInfo.MODID + ":"
				+ nameTexture + "_top1");
		this.pathTop2 = register.registerIcon(ModInfo.MODID + ":"
				+ nameTexture + "_top2");
		this.pathTop3 = register.registerIcon(ModInfo.MODID + ":"
				+ nameTexture + "_top3");
	}

	@Override
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4,
			EntityLivingBase par5EntityLiving, ItemStack par6ItemStack) {
		int l = MathHelper
				.floor_double((double) (par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
		par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
	}
}