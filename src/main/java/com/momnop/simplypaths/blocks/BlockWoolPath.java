package com.momnop.simplypaths.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.momnop.simplypaths.SimplyPathsCreativeTab;
import com.momnop.simplypaths.info.ModInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockWoolPath extends Block {
	@SideOnly(Side.CLIENT)
	private IIcon whiteIcon;
	private IIcon orangeIcon;
	private IIcon magentaIcon;
	private IIcon lightBlueIcon;
	private IIcon yellowIcon;
	private IIcon limeIcon;
	private IIcon pinkIcon;
	private IIcon grayIcon;
	private IIcon lightGrayIcon;
	private IIcon cyanIcon;
	private IIcon purpleIcon;
	private IIcon blueIcon;
	private IIcon brownIcon;
	private IIcon greenIcon;
	private IIcon redIcon;
	private IIcon blackIcon;

	public BlockWoolPath(Material material, String unlocalizedName,
			String soundType, float hardness) {
		super(Material.rock);
		setCreativeTab(SimplyPathsCreativeTab.INSTANCE);
		setBlockBounds(0F, 0F, 0F, 1F, 15F / 16F, 1F);
		setLightOpacity(255);
		setHardness(hardness);
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
	public void onEntityWalking(World world, int x, int y, int z, Entity entity) {
		float speed = 2F;
		float max = 0.4F;

		double motionX = Math.abs(entity.motionX);
		double motionZ = Math.abs(entity.motionZ);
		if(motionX < max)
			entity.motionX *= speed;
		if(motionZ < max)
			entity.motionZ *= speed;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x,
			int y, int z) {
		return AxisAlignedBB.getBoundingBox(x, y, z, x + 1, y + (15F / 16F), z + 1);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register)
    {
    	whiteIcon = register.registerIcon("wool_colored_" + "white");
        orangeIcon = register.registerIcon("wool_colored_" + "orange");
        magentaIcon = register.registerIcon("wool_colored_" + "magenta");
        lightBlueIcon = register.registerIcon("wool_colored_" + "light_blue");
        yellowIcon = register.registerIcon("wool_colored_" + "yellow");
        limeIcon = register.registerIcon("wool_colored_" + "lime");
        pinkIcon = register.registerIcon("wool_colored_" + "pink");
        grayIcon = register.registerIcon("wool_colored_" + "gray");
        lightGrayIcon = register.registerIcon("wool_colored_" + "silver");
        cyanIcon = register.registerIcon("wool_colored_" + "cyan");
        purpleIcon = register.registerIcon("wool_colored_" + "purple");
        blueIcon = register.registerIcon("wool_colored_" + "blue");
        brownIcon = register.registerIcon("wool_colored_" + "brown");
        greenIcon = register.registerIcon("wool_colored_" + "green");
        redIcon = register.registerIcon("wool_colored_" + "red");
        blackIcon = register.registerIcon("wool_colored_" + "black");
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        switch (meta)
        {
            case 0:
                return whiteIcon;

            case 1:
                return orangeIcon;

            case 2:
                return magentaIcon;

            case 3:
                return lightBlueIcon;

            case 4:
                return yellowIcon;

            case 5:
                return limeIcon;

            case 6:
                return pinkIcon;
                
            case 7:
                return grayIcon;

            case 8:
                return lightGrayIcon;

            case 9:
                return cyanIcon;

            case 10:
                return purpleIcon;

            case 11:
                return blueIcon;

            case 12:
                return brownIcon;

            case 13:
                return greenIcon;
                
            case 14:
                return redIcon;

            case 15:
                return blackIcon;

            default:
                return whiteIcon;
        }
    }

	@Override
	public int damageDropped(int meta) {
		return meta;
	}

}