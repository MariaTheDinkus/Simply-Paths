package com.momnop.simplypaths.blocks;

import java.util.Random;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.momnop.simplypaths.SimplyPathsCreativeTab;
import com.momnop.simplypaths.blocks.tiles.TileEntityFastestDownMovingStair;
import com.momnop.simplypaths.info.ModInfo;
import com.momnop.simplypaths.items.SimplyPathsItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMovingFastestDownStairPath extends BlockStairs implements
		ITileEntityProvider {

	@SideOnly(Side.CLIENT)
	private IIcon pathTop0;
	@SideOnly(Side.CLIENT)
	private IIcon pathTop1;
	@SideOnly(Side.CLIENT)
	private IIcon pathTop2;
	@SideOnly(Side.CLIENT)
	private IIcon pathTop3;

	public BlockMovingFastestDownStairPath(Material material,
			String unlocalizedName, String soundType, float hardness,
			int harvestLevel, String toolType) {
		super(Blocks.stone, harvestLevel);
		setCreativeTab(SimplyPathsCreativeTab.INSTANCE);
		setLightOpacity(255);
		setHardness(hardness);
		setHarvestLevel(toolType, harvestLevel);
		setBlockName(unlocalizedName);
		useNeighborBrightness = true;

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
			return pathTop1;
		if (meta == 0 && side == 4)
			return pathTop2;
		if (meta == 2 && side == 1)
			return pathTop2;
		if (meta == 2 && side == 2)
			return pathTop2;
		if (meta == 1 && side == 1)
			return pathTop3;
		if (meta == 1 && side == 5)
			return pathTop0;
		if (meta == 3 && side == 1)
			return pathTop0;
		if (meta == 3 && side == 3)
			return pathTop0;
		return blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register) {
		this.blockIcon = register.registerIcon("diamond_block");
		this.pathTop0 = register.registerIcon(ModInfo.MODID + ":"
				+ "conveyorPath" + "_top0");
		this.pathTop1 = register.registerIcon(ModInfo.MODID + ":"
				+ "conveyorPath" + "_top1");
		this.pathTop2 = register.registerIcon(ModInfo.MODID + ":"
				+ "conveyorPath" + "_top2");
		this.pathTop3 = register.registerIcon(ModInfo.MODID + ":"
				+ "conveyorPath" + "_top3");
	}

	public void onBlockPlacedBy(World p_149689_1_, int p_149689_2_,
			int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_,
			ItemStack p_149689_6_) {
		int l = MathHelper
				.floor_double((double) (p_149689_5_.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		int i1 = p_149689_1_.getBlockMetadata(p_149689_2_, p_149689_3_,
				p_149689_4_) & 4;

		if (l == 0) {
			p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_,
					p_149689_4_, 2 | i1, 2);
		}

		if (l == 1) {
			p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_,
					p_149689_4_, 1 | i1, 2);
		}

		if (l == 2) {
			p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_,
					p_149689_4_, 3 | i1, 2);
		}

		if (l == 3) {
			p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_,
					p_149689_4_, 0 | i1, 2);
		}
	}
	
	@Override
    public Item getItemDropped(int a, Random random, int b)
    {
        return Item.getItemFromBlock(SimplyPathsBlocks.blockFastestMovingStairPath);
    }

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityFastestDownMovingStair();
	}
}