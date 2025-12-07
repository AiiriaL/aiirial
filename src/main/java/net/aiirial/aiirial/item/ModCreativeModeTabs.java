package net.aiirial.aiirial.item;

import net.aiirial.aiirial.AiiriaL;
import net.aiirial.aiirial.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AiiriaL.MOD_ID);

    public static final Supplier<CreativeModeTab> AIIRIAL_MOD_ITEM_TAB =
            CREATIVE_MODE_TABS.register("aiirial_mod_item_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.aiirial.aiirial_mod_item_tab"))
                    .icon(() -> new ItemStack(ModItems.BLEI_INGOT.get()))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BLEI_INGOT);
                        output.accept(ModItems.RAW_GALENIT);
                        output.accept(ModBlocks.BLEI_BLOCK);
                        output.accept(ModBlocks.RAW_GALENIT_BLOCK);
                        output.accept(ModBlocks.GALENIT_ORE_BLOCK);
                        output.accept(ModItems.BLEI_NUGGET);
                        output.accept(ModItems.BLEI_KUGEL);

                    })).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
