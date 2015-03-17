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

public class BlockMetal extends Block {
	public static IIcon[] textures = new IIcon[47];
	public int[] textureRefByID = { 0, 0, 6, 6, 0, 0, 6, 6, 3, 3, 19, 15, 3, 3, 
			19, 15, 1, 1, 18, 18, 1, 1, 13, 13, 2, 2, 23, 31, 2, 2, 27, 14, 0, 0, 6, 6, 0, 
			0, 6, 6, 3, 3, 19, 15, 3, 3, 19, 15, 1, 1, 18, 18, 1, 1, 13, 13, 2, 2, 23, 31, 
			2, 2, 27, 14, 4, 4, 5, 5, 4, 4, 5, 5, 17, 17, 22, 26, 17, 17, 22, 26, 16, 16, 
			20, 20, 16, 16, 28, 28, 21, 21, 46, 42, 21, 21, 43, 38, 4, 4, 5, 5, 4, 4, 5, 5, 
			9, 9, 30, 12, 9, 9, 30, 12, 16, 16, 20, 20, 16, 16, 28, 28, 25, 25, 45, 37, 25, 
			25, 40, 32, 0, 0, 6, 6, 0, 0, 6, 6, 3, 3, 19, 15, 3, 3, 19, 15, 1, 1, 18, 18, 1,
			1, 13, 13, 2, 2, 23, 31, 2, 2, 27, 14, 0, 0, 6, 6, 0, 0, 6, 6, 3, 3, 19, 15, 3,
			3, 19, 15, 1, 1, 18, 18, 1, 1, 13, 13, 2, 2, 23, 31, 2, 2, 27, 14, 4, 4, 5, 5, 4,
			4, 5, 5, 17, 17, 22, 26, 17, 17, 22, 26, 7, 7, 24, 24, 7, 7, 10, 10, 29, 29, 44, 
			41, 29, 29, 39, 33, 4, 4, 5, 5, 4, 4, 5, 5, 9, 9, 30, 12, 9, 9, 30, 12, 7, 7, 24, 
			24, 7, 7, 10, 10, 8, 8, 36, 35, 8, 8, 34, 11 };
	
	public BlockMetal(String unlocalizedName, String soundType,
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
	public void registerBlockIcons(IIconRegister iconRegistry)
	{
		 for (int i = 0; i < 47; i++) textures[i] = iconRegistry.registerIcon(ModInfo.MODID + ":" + "metalPath_" + (i+1));
	}
	
	public IIcon getIcon(int side, int meta)
	{
		 return textures[0];
	}
	
	public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side)
	{
		 boolean[] bitMatrix = new boolean[8];
		
		 if (side == 0 || side == 1)
		 {
			 bitMatrix[0] = world.getBlock(x-1, y, z-1) == this;
			 bitMatrix[1] = world.getBlock(x, y, z-1) == this;
			 bitMatrix[2] = world.getBlock(x+1, y, z-1) == this;
			 bitMatrix[3] = world.getBlock(x-1, y, z) == this;
			 bitMatrix[4] = world.getBlock(x+1, y, z) == this;
			 bitMatrix[5] = world.getBlock(x-1, y, z+1) == this;
			 bitMatrix[6] = world.getBlock(x, y, z+1) == this;
			 bitMatrix[7] = world.getBlock(x+1, y, z+1) == this;
		 }
		 if (side == 2 || side == 3)
		 {
			 bitMatrix[0] = world.getBlock(x+(side==2?1:-1), y+1, z) == this;
			 bitMatrix[1] = world.getBlock(x, y+1, z)			 == this;
			 bitMatrix[2] = world.getBlock(x+(side==3?1:-1), y+1, z) == this;
			 bitMatrix[3] = world.getBlock(x+(side==2?1:-1), y, z) == this;
			 bitMatrix[4] = world.getBlock(x+(side==3?1:-1), y, z) == this;
			 bitMatrix[5] = world.getBlock(x+(side==2?1:-1), y-1, z) == this;
			 bitMatrix[6] = world.getBlock(x, y-1, z)			 == this;
			 bitMatrix[7] = world.getBlock(x+(side==3?1:-1), y-1, z) == this;
		 }
		 if (side == 4 || side == 5)
		 {
			 bitMatrix[0] = world.getBlock(x, y+1, z+(side==5?1:-1)) == this;
			 bitMatrix[1] = world.getBlock(x, y+1, z)			 == this;
			 bitMatrix[2] = world.getBlock(x, y+1, z+(side==4?1:-1)) == this;
			 bitMatrix[3] = world.getBlock(x, y, z+(side==5?1:-1)) == this;
			 bitMatrix[4] = world.getBlock(x, y, z+(side==4?1:-1)) == this;
			 bitMatrix[5] = world.getBlock(x, y-1, z+(side==5?1:-1)) == this;
			 bitMatrix[6] = world.getBlock(x, y-1, z)			 == this;
			 bitMatrix[7] = world.getBlock(x, y-1, z+(side==4?1:-1)) == this;
		 }
		
		 int idBuilder = 0;

		 for (int i = 0; i <= 7; i++) idBuilder = idBuilder + (bitMatrix[i]?(i==0?1:(i==1?2:(i==2?4:(i==3?8:(i==4?16:(i==5?32:(i==6?64:128))))))):0);
		
		 return idBuilder>255||idBuilder<0?textures[0]:textures[textureRefByID[idBuilder]];
	}

}