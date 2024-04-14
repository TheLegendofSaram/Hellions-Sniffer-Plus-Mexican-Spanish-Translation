package com.helliongames.snifferplus.registration;

import com.helliongames.snifferplus.world.gen.features.SnifferPlusFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class SnifferPlusTreeGrowers {
    public static final TreeGrower STONE_PINE = new TreeGrower("stone_pine", Optional.empty(), Optional.of(SnifferPlusFeatures.STONE_PINE_TREE), Optional.empty());
}
