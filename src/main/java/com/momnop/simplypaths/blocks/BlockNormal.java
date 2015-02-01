package com.momnop.simplypaths.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.momnop.simplypaths.SimplyPaths;
import com.momnop.simplypaths.SimplyPathsCreativeTab;
import com.momnop.simplypaths.info.ModInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockNormal extends Block {
	public BlockNormal(String unlocalizedName, String soundType,
			float hardness, int harvestLevel, String toolType) {
		super(Material.rock);
		setCreativeTab(SimplyPathsCreativeTab.INSTANCE);
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
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register) {
		blockIcon = register.registerIcon(ModInfo.MODID + ":"
				+ getUnlocalizedName().substring(5));
	}

}