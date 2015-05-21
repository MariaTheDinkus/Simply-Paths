package com.momnop.simplypaths.blocks.tiles;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

public class TileEntityFastDownMovingStair extends TileEntity {
	
	@Override
    public void updateEntity()
    {	
            int x = this.xCoord, y = this.yCoord, z = this.zCoord;
            List entities = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(
            		x, y + 1, z, x + 1, yCoord + 1.1F, z + 1));
            for (Object obj : entities)
               {
               if (obj instanceof Entity) {
            	   Entity entity = (Entity)obj;
            	   entity.stepHeight = 0.6F;
                if (entity!= null && entity.onGround && !entity.isInWater())
                {
                	if (this.worldObj.getBlockMetadata(x, y, z) == 2) {
            			entity.motionZ += -0.4F;
            			if (entity.motionZ < -0.4F) {
            				entity.motionZ = -0.4F;
            			}
            		} else if (this.worldObj.getBlockMetadata(x, y, z) == 1) {
            			entity.motionX += 0.4F;
            			if (entity.motionX > 0.4F) {
            				entity.motionX = 0.4F;
            			}
            		} else if (this.worldObj.getBlockMetadata(x, y, z) == 0) {
            			entity.motionX += -0.4F;
            			if (entity.motionX < -0.4F) {
            				entity.motionX = -0.4F;
            			}
            		} else if (this.worldObj.getBlockMetadata(x, y, z) == 3) {
            			entity.motionZ += 0.4F;
            			if (entity.motionZ > 0.4F) {
            				entity.motionZ = 0.4F;
            			}
            		}
                }
            }
        }
    }
}
