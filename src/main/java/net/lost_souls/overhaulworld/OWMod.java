package net.lost_souls.overhaulworld;

import com.mojang.logging.LogUtils;
import net.lost_souls.overhaulworld.block.ModBlocks;
import net.lost_souls.overhaulworld.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(OWMod.MOD_ID)
public class OWMod {
    public static final String MOD_ID = "overhaulworld";
    public static final Logger LOGGER = LogUtils.getLogger();

    public OWMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        modEventBus.addListener(this::commonSetup);

        // Регистрация клиентских настроек
        modEventBus.addListener(this::clientSetup);

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        // Регистрация событий
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        //MinecraftForge.EVENT_BUS.register(DisableRegeneration.class);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Здесь можно разместить код, который должен выполняться при запуске сервера
    }
}
