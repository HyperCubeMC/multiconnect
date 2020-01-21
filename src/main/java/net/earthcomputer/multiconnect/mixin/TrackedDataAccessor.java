package net.earthcomputer.multiconnect.mixin;

import net.minecraft.entity.data.TrackedData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(TrackedData.class)
public interface TrackedDataAccessor {

    @Accessor
    @Mutable
    void setId(int id);

}
