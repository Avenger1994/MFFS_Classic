package com.mffs.model.items.modules.interdiction;

import com.mffs.api.security.IInterdictionMatrix;
import com.mffs.model.items.modules.ItemMatrixModule;
import com.mffs.model.items.modules.projector.ModuleShock;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.INpc;
import net.minecraft.entity.monster.IMob;

/**
 * @author Calclavia
 */
public class ModuleAntiHostile extends ItemMatrixModule {

    @Override
    public boolean onDefend(IInterdictionMatrix paramIInterdictionMatrix, EntityLivingBase paramEntityLivingBase) {
        if(paramEntityLivingBase instanceof IMob) {
            paramEntityLivingBase.attackEntityFrom(ModuleShock.SHOCK_SOURCE, 20F);
        }
        return false;
    }

}
