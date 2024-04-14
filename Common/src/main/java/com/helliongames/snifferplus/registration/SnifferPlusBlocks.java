package com.helliongames.snifferplus.registration;

import com.helliongames.snifferplus.Constants;
import com.helliongames.snifferplus.blocks.IvyBodyBlock;
import com.helliongames.snifferplus.blocks.IvyHeadBlock;
import com.helliongames.snifferplus.blocks.SnifferPlusBlockSetTypes;
import com.helliongames.snifferplus.blocks.SnifferPlusWoodTypes;
import com.helliongames.snifferplus.mixin.ButtonBlockAccessor;
import com.helliongames.snifferplus.mixin.DoorBlockAccessor;
import com.helliongames.snifferplus.mixin.PressurePlateBlockAccessor;
import com.helliongames.snifferplus.mixin.SaplingBlockAccessor;
import com.helliongames.snifferplus.mixin.StairBlockAccessor;
import com.helliongames.snifferplus.mixin.TallGrassBlockAccessor;
import com.helliongames.snifferplus.mixin.TrapDoorBlockAccessor;
import com.helliongames.snifferplus.registration.util.RegistrationProvider;
import com.helliongames.snifferplus.registration.util.RegistryObject;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public class SnifferPlusBlocks {

    /**
     * The provider for blocks
     */
    public static final RegistrationProvider<Block> BLOCKS = RegistrationProvider.get(Registries.BLOCK, Constants.MOD_ID);

    public static final RegistryObject<Block> STONE_PINE_PLANKS = BLOCKS.register("stone_pine_planks", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0f, 3.0f).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> STONE_PINE_SAPLING = BLOCKS.register("stone_pine_sapling", () -> SaplingBlockAccessor.createSaplingBlock(SnifferPlusTreeGrowers.STONE_PINE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> STONE_PINE_LOG = BLOCKS.register("stone_pine_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0f).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> STRIPPED_STONE_PINE_LOG = BLOCKS.register("stripped_stone_pine_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(STONE_PINE_LOG.get())));
    public static final RegistryObject<Block> STONE_PINE_WOOD = BLOCKS.register("stone_pine_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_STONE_PINE_WOOD = BLOCKS.register("stripped_stone_pine_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STONE_PINE_LEAVES = BLOCKS.register("stone_pine_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> STONE_PINE_STAIRS = BLOCKS.register("stone_pine_stairs", () -> StairBlockAccessor.createStairBlock(STONE_PINE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(STONE_PINE_PLANKS.get())));
    public static final RegistryObject<Block> STONE_PINE_SLAB = BLOCKS.register("stone_pine_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> STONE_PINE_SIGN = BLOCKS.register("stone_pine_sign", () -> new StandingSignBlock(SnifferPlusWoodTypes.STONE_PINE, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0f).ignitedByLava()));
    public static final RegistryObject<Block> STONE_PINE_WALL_SIGN = BLOCKS.register("stone_pine_wall_sign", () -> new WallSignBlock(SnifferPlusWoodTypes.STONE_PINE, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0f).dropsLike(STONE_PINE_SIGN.get()).ignitedByLava()));
    public static final RegistryObject<Block> STONE_PINE_HANGING_SIGN = BLOCKS.register("stone_pine_hanging_sign", () -> new CeilingHangingSignBlock(SnifferPlusWoodTypes.STONE_PINE, BlockBehaviour.Properties.of().mapColor(STONE_PINE_LOG.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0f).ignitedByLava()));
    public static final RegistryObject<Block> STONE_PINE_WALL_HANGING_SIGN = BLOCKS.register("stone_pine_wall_hanging_sign", () -> new WallHangingSignBlock(SnifferPlusWoodTypes.STONE_PINE, BlockBehaviour.Properties.of().mapColor(STONE_PINE_LOG.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0f).ignitedByLava().dropsLike(STONE_PINE_HANGING_SIGN.get())));
    public static final RegistryObject<Block> STONE_PINE_DOOR = BLOCKS.register("stone_pine_door", () -> DoorBlockAccessor.createDoorBlock(SnifferPlusBlockSetTypes.STONE_PINE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> STONE_PINE_TRAPDOOR = BLOCKS.register("stone_pine_trapdoor", () -> TrapDoorBlockAccessor.createTrapDoorBlock(SnifferPlusBlockSetTypes.STONE_PINE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final RegistryObject<Block> STONE_PINE_PRESSURE_PLATE = BLOCKS.register("stone_pine_pressure_plate", () -> PressurePlateBlockAccessor.createPressurePlateBlock(SnifferPlusBlockSetTypes.STONE_PINE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> STONE_PINE_BUTTON = BLOCKS.register("stone_pine_button", () -> ButtonBlockAccessor.createButtonBlock(SnifferPlusBlockSetTypes.STONE_PINE, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> STONE_PINE_FENCE = BLOCKS.register("stone_pine_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> STONE_PINE_FENCE_GATE = BLOCKS.register("stone_pine_fence_gate", () -> new FenceGateBlock(SnifferPlusWoodTypes.STONE_PINE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<Block> POTTED_STONE_PINE_SAPLING = BLOCKS.register("potted_stone_pine_sapling", () -> new FlowerPotBlock(STONE_PINE_SAPLING.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));

    public static final RegistryObject<IvyBodyBlock> IVY_BODY = BLOCKS.register("ivy_body", () -> new IvyBodyBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<IvyHeadBlock> IVY_HEAD = BLOCKS.register("ivy_head", () -> new IvyHeadBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> FIDDLEFERN = BLOCKS.register("fiddlefern", () -> TallGrassBlockAccessor.createTallGrassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> TALL_FIDDLEFERN = BLOCKS.register("tall_fiddlefern", () -> new DoublePlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).replaceable().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));

    // Called in the mod initializer / constructor in order to make sure that items are registered
    public static void loadClass() {}
}
