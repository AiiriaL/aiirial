package net.aiirial.aiirial.item;

import net.aiirial.aiirial.AiiriaL;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;





public class ModItems{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AiiriaL.MOD_ID);

    public static final DeferredItem<Item> RAW_GALENIT = ITEMS.registerSimpleItem("raw_galenit");
    public static final DeferredItem<Item> BLEI_INGOT = ITEMS.registerSimpleItem("blei_ingot");


    //     public static final DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("example_block", EXAMPLE_BLOCK);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
