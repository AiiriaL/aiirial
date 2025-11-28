package net.aiirial.aiirial.block;

import net.aiirial.aiirial.AiiriaL;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(AiiriaL.MOD_ID);

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(AiiriaL.MOD_ID);



    // Blöcke erstellen + Eigenschaften

    public static final DeferredBlock<Block> BLEI_BLOCK = BLOCKS.register(
            "blei_block",
            registryName -> new Block(
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create(Registries.BLOCK, registryName))
                            .destroyTime(2.0f)
                            .explosionResistance(6.0f)
                            .sound(SoundType.IRON)
            )
    );
    public static final DeferredBlock<Block> RAW_GALENIT_BLOCK = BLOCKS.register(
            "raw_galenit_block",
            registryName -> new Block(
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create(Registries.BLOCK, registryName))
                            .destroyTime(2.0f)
                            .explosionResistance(6.0f)
                            .sound(SoundType.IRON)
            )
    );

    public static final DeferredItem<BlockItem> BLEI_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("blei_block", BLEI_BLOCK);
    public static final DeferredItem<BlockItem> RAW_GALENIT_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("raw_galenit_block", RAW_GALENIT_BLOCK);

    // Muss im Mod-Konstruktor aufgerufen werden
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);

    }
}

