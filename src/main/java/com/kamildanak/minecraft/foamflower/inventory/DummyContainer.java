package com.kamildanak.minecraft.foamflower.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

import javax.annotation.Nonnull;

public class DummyContainer extends Container {
    @Override
    public boolean canInteractWith(@Nonnull EntityPlayer entityplayer) {
        return true;
    }
}
