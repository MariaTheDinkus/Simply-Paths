package com.momnop.simplypaths.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.carpentersblocks.block.BlockCoverable;
import com.carpentersblocks.data.Slab;
import com.carpentersblocks.tileentity.TEBase;
import com.carpentersblocks.util.handler.EventHandler;
import com.carpentersblocks.util.registry.BlockRegistry;
import com.carpentersblocks.util.registry.IconRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCarpentersPath extends BlockCoverable {

    private static float[][] bounds = {
        { 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F }, // FULL BLOCK
        { 0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F }, // SLAB WEST
        { 0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F }, // SLAB EAST
        { 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F }, // SLAB DOWN
        { 0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F }, // SLAB UP
        { 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F }, // SLAB NORTH
        { 0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F }  // SLAB SOUTH
    };

    public BlockCarpentersPath(Material material)
    {
        super(material);
        setBlockBounds(0F, 0F, 0F, 1F, 15F / 16F, 1F);
        setLightOpacity(255);
        useNeighborBrightness = true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    /**
     * Returns a base icon that doesn't rely on blockIcon, which
     * is set prior to texture stitch events.
     */
    public IIcon getIcon()
    {
        return IconRegistry.icon_uncovered_quartered;
    }

    @Override
    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLiving, ItemStack itemStack)
    {
        super.onBlockPlacedBy(world, x, y, z, entityLiving, itemStack);

        TEBase TE = getTileEntity(world, x, y, z);

        if (TE != null) {

            int data = Slab.BLOCK_FULL;

            if (!entityLiving.isSneaking()) {

                /* Match block type with adjacent type if possible. */

                TEBase[] TE_list = getAdjacentTileEntities(world, x, y, z);

                for (TEBase TE_current : TE_list) {
                    if (TE_current != null) {
                        if (TE_current.getBlockType().equals(this)) {
                            data = TE_current.getData();
                        }
                    }
                }

            }

            TE.setData(data);
        }
    }
    
    @Override
	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {
		Block blockAbove = world.getBlock(x, y + 1, z);
		if(!blockAbove.isAir(world, x, y + 1, z))
			setBlockBounds(0F, 0F, 0F, 1F, 1, 1F);
		else setBlockBounds(0F, 0F, 0F, 1F, 15F / 16F, 1F);
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
		setBlockBoundsBasedOnState(world, x, y, z);
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
    /**
     * Checks if the block is a solid face on the given side, used by placement logic.
     */
    public boolean isSideSolid(IBlockAccess blockAccess, int x, int y, int z, ForgeDirection side)
    {
        TEBase TE = getTileEntity(blockAccess, x, y, z);

        if (TE != null) {

            if (isBlockSolid(blockAccess, x, y, z)) {

                int data = TE.getData();

                if (data == Slab.BLOCK_FULL) {
                    return true;
                } else if (data == Slab.SLAB_Y_NEG && side == ForgeDirection.DOWN) {
                    return true;
                } else if (data == Slab.SLAB_Y_POS && side == ForgeDirection.UP) {
                    return true;
                } else if (data == Slab.SLAB_Z_NEG && side == ForgeDirection.NORTH) {
                    return true;
                } else if (data == Slab.SLAB_Z_POS && side == ForgeDirection.SOUTH) {
                    return true;
                } else if (data == Slab.SLAB_X_NEG && side == ForgeDirection.WEST) {
                    return true;
                } else if (data == Slab.SLAB_X_POS && side == ForgeDirection.EAST) {
                    return true;
                }

            }

        }

        return false;
    }

    /**
     * Called to determine whether to allow the a block to handle its own indirect power rather than using the default rules.
     * @param world The world
     * @param x The x position of this block instance
     * @param y The y position of this block instance
     * @param z The z position of this block instance
     * @param side The INPUT side of the block to be powered - ie the opposite of this block's output side
     * @return Whether Block#isProvidingWeakPower should be called when determining indirect power
     */
    @Override
    public boolean shouldCheckWeakPower(IBlockAccess blockAccess, int x, int y, int z, int side)
    {
        TEBase TE = getTileEntity(blockAccess, x, y, z);

        if (TE != null) {
            int data = TE.getData();
            return data == Slab.BLOCK_FULL;
        }

        return super.shouldCheckWeakPower(blockAccess, x, y, z, side);
    }

    @Override
    /**
     * Compares dimensions and coordinates of two opposite
     * sides to determine whether they share faces.
     */
    protected boolean shareFaces(TEBase TE_adj, TEBase TE_src, ForgeDirection side_adj, ForgeDirection side_src)
    {
        if (TE_adj.getBlockType() == this) {

            setBlockBoundsBasedOnState(TE_src.getWorldObj(), TE_src.xCoord, TE_src.yCoord, TE_src.zCoord);
            double[] bnds_src = { getBlockBoundsMinX(), getBlockBoundsMinY(), getBlockBoundsMinZ(), getBlockBoundsMaxX(), getBlockBoundsMaxY(), getBlockBoundsMaxZ() };
            setBlockBoundsBasedOnState(TE_adj.getWorldObj(), TE_adj.xCoord, TE_adj.yCoord, TE_adj.zCoord);

            switch (side_src) {
                case DOWN:
                    return maxY == 1.0D && bnds_src[1] == 0.0D && minX == bnds_src[0] && maxX == bnds_src[3] && minZ == bnds_src[2] && maxZ == bnds_src[5];
                case UP:
                    return minY == 0.0D && bnds_src[4] == 1.0D && minX == bnds_src[0] && maxX == bnds_src[3] && minZ == bnds_src[2] && maxZ == bnds_src[5];
                case NORTH:
                    return maxZ == 1.0D && bnds_src[2] == 0.0D && minX == bnds_src[0] && maxX == bnds_src[3] && minY == bnds_src[1] && maxY == bnds_src[4];
                case SOUTH:
                    return minZ == 0.0D && bnds_src[5] == 1.0D && minX == bnds_src[0] && maxX == bnds_src[3] && minY == bnds_src[1] && maxY == bnds_src[4];
                case WEST:
                    return maxX == 1.0D && bnds_src[0] == 0.0D && minY == bnds_src[1] && maxY == bnds_src[4] && minZ == bnds_src[2] && maxZ == bnds_src[5];
                case EAST:
                    return minX == 0.0D && bnds_src[3] == 1.0D && minY == bnds_src[1] && maxY == bnds_src[4] && minZ == bnds_src[2] && maxZ == bnds_src[5];
                default:
                    return false;
            }

        }

        return super.shareFaces(TE_adj, TE_src, side_adj, side_src);
    }

    @Override
    /**
     * Returns whether block can support cover on side.
     */
    public boolean canCoverSide(TEBase TE, World world, int x, int y, int z, int side)
    {
        return true;
    }

    @Override
    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return BlockRegistry.carpentersBlockRenderID;
    }

}
