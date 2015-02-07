package com.momnop.simplypaths.blocks.tiles;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;

public class TileEntityFastestMovingStair extends TileEntity {
	
	@Override
    public void updateEntity()
    {
            int x = this.xCoord, y = this.yCoord, z = this.zCoord;
            List entities = this.worldObj.getEntitiesWithinAABB(Entity.class, this.getRenderBoundingBox().expand(0, 1, 0));
            for (Object obj : entities)
               {
               if (obj instanceof Entity) {
            	   Entity entity = (Entity)obj;
            	   entity.stepHeight = 0.6F;
                if (entity!= null && entity.onGround && !entity.isInWater())
                {
                	if (this.worldObj.getBlockMetadata(x, y, z) == 2) {
            			entity.motionZ += 0.65F;
            			if (entity.motionZ > 0.65F) {
            				entity.motionZ = 0.65F;
            			}
            		} else if (this.worldObj.getBlockMetadata(x, y, z) == 1) {
            			entity.motionX += -0.65F;
            			if (entity.motionX < -0.65F) {
            				entity.motionX = -0.65F;
            			}
            		} else if (this.worldObj.getBlockMetadata(x, y, z) == 0) {
            			entity.motionX += 0.65F;
            			if (entity.motionX > 0.65F) {
            				entity.motionX = 0.65F;
            			}
            		} else if (this.worldObj.getBlockMetadata(x, y, z) == 3) {
            			entity.motionZ += -0.65F;
            			if (entity.motionZ < -0.65F) {
            				entity.motionZ = -0.65F;
            			}
            		}
                }
            }
        }
    }
}
