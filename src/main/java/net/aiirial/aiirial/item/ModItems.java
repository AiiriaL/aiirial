package net.aiirial.aiirial.item;

import net.aiirial.aiirial.AiiriaL;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;





public class ModItems{


    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AiiriaL.MOD_ID);

    // ITEMS REGISTRIEREN
    public static final DeferredItem<Item> RAW_GALENIT = ITEMS.registerItem("raw_galenit", Item::new);
    public static final DeferredItem<Item> BLEI_INGOT = ITEMS.registerItem("blei_ingot", Item::new);
    public static final DeferredItem<Item> BLEI_NUGGET = ITEMS.registerItem("blei_nugget", Item::new);
    public static final DeferredItem<Item> BLEI_KUGEL = ITEMS.registerItem("blei_kugel", Item::new);

    // Platzhalter für später
    public static final DeferredItem<Item> MUSKETEITEM = ITEMS.registerItem("musketeitem", Item::new);


    // EVENT
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
