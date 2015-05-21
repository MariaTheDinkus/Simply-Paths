package com.momnop.simplypaths.blocks.tiles;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

public class TileEntityLowRangeItemPropeller extends TileEntity {

	@Override
	public void updateEntity() {
		int x = this.xCoord, y = this.yCoord, z = this.zCoord;
		List entities = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(
                x, y, z, x + 1, yCoord + 3, z + 1));
		for (Object obj : entities) {
			if (obj instanceof EntityItem) {
				EntityItem entity = (EntityItem) obj;
				entity.stepHeight = 0.6F;
				if (entity != null && !entity.isInWater() && worldObj.isAirBlock(xCoord, yCoord + 1, zCoord)) {
					entity.motionY += 0.2F;
					if (entity.motionY > 0.2F) {
						entity.motionY = 0.2F;
					}
				}
			}
		}
	}
}
