package com.momnop.simplypaths.blocks;

import com.momnop.simplypaths.SimplyPathsCreativeTab;
import com.momnop.simplypaths.blocks.tiles.TileEntityMovingPath;
import com.momnop.simplypaths.info.ModInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockMovingSlowPath extends BlockContainer {

	@SideOnly(Side.CLIENT)
	private IIcon pathTop0;
	@SideOnly(Side.CLIENT)
	private IIcon pathTop1;
	@SideOnly(Side.CLIENT)
	private IIcon pathTop2;
	@SideOnly(Side.CLIENT)
	private IIcon pathTop3;

	public BlockMovingSlowPath(Material material, String unlocalizedName, String soundType,
			float hardness, int harvestLevel, String toolType) {
		super(material);
		setCreativeTab(SimplyPathsCreativeTab.INSTANCE);
		setBlockBounds(0F, 0F, 0F, 1F, 15F / 16F, 1F);
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
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x,
			int y, int z) {
		return AxisAlignedBB.getBoundingBox(x, y, z, x + 1, y + (15F / 16F),
				z + 1);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	public void onBlockAdded(World world, int x, int y, int z) {
		super.onBlockAdded(world, x, y, z);
		this.setDefaultDirection(world, x, y, z);
	}

	private void setDefaultDirection(World p_149930_1_, int p_149930_2_,
			int p_149930_3_, int p_149930_4_) {
		if (!p_149930_1_.isRemote) {
			Block block = p_149930_1_.getBlock(p_149930_2_, p_149930_3_,
					p_149930_4_ - 1);
			Block block1 = p_149930_1_.getBlock(p_149930_2_, p_149930_3_,
					p_149930_4_ + 1);
			Block block2 = p_149930_1_.getBlock(p_149930_2_ - 1, p_149930_3_,
					p_149930_4_);
			Block block3 = p_149930_1_.getBlock(p_149930_2_ + 1, p_149930_3_,
					p_149930_4_);
			byte b0 = 3;

			if (block.func_149730_j() && !block1.func_149730_j()) {
				b0 = 3;
			}

			if (block1.func_149730_j() && !block.func_149730_j()) {
				b0 = 2;
			}

			if (block2.func_149730_j() && !block3.func_149730_j()) {
				b0 = 5;
			}

			if (block3.func_149730_j() && !block2.func_149730_j()) {
				b0 = 4;
			}

			p_149930_1_.setBlockMetadataWithNotify(p_149930_2_, p_149930_3_,
					p_149930_4_, b0, 2);
		}
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
		this.blockIcon = register.registerIcon("iron_block");
		this.pathTop0 = register.registerIcon(ModInfo.MODID + ":"
				+ getUnlocalizedName().substring(5) + "_top0");
		this.pathTop1 = register.registerIcon(ModInfo.MODID + ":"
				+ getUnlocalizedName().substring(5) + "_top1");
		this.pathTop2 = register.registerIcon(ModInfo.MODID + ":"
				+ getUnlocalizedName().substring(5) + "_top2");
		this.pathTop3 = register.registerIcon(ModInfo.MODID + ":"
				+ getUnlocalizedName().substring(5) + "_top3");
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityMovingPath();
	}

	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z,
			Entity entity) {
		Entity p = entity;
		p.stepHeight = 1.0F;
		if (world.getBlockMetadata(x, y, z) == 0) {
			p.motionZ += -0.2F;
			if (p.motionZ < -0.2F) {
				p.motionZ = -0.2F;
			}
		} else if (world.getBlockMetadata(x, y, z) == 1) {
			p.motionX += 0.2F;
			if (p.motionX > 0.2F) {
				p.motionX = 0.2F;
			}
		} else if (world.getBlockMetadata(x, y, z) == 2) {
			p.motionZ += 0.2F;
			if (p.motionZ > 0.2F) {
				p.motionZ = 0.2F;
			}
		} else if (world.getBlockMetadata(x, y, z) == 3) {
			p.motionX += -0.2F;
			if (p.motionX < -0.2F) {
				p.motionX = -0.2F;
			}
		}
	}

	@Override
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4,
			EntityLivingBase par5EntityLiving, ItemStack par6ItemStack) {
		int l = MathHelper
				.floor_double((double) (par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
		par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
	}
}