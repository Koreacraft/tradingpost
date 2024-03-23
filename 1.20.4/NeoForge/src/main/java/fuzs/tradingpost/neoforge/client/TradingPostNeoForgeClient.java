package fuzs.tradingpost.neoforge.client;

import fuzs.puzzleslib.api.client.core.v1.ClientModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v2.core.DataProviderHelper;
import fuzs.tradingpost.TradingPost;
import fuzs.tradingpost.client.TradingPostClient;
import fuzs.tradingpost.data.client.ModLanguageProvider;
import fuzs.tradingpost.data.client.ModModelProvider;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;

@Mod.EventBusSubscriber(modid = TradingPost.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TradingPostNeoForgeClient {

    @SubscribeEvent
    public static void onConstructMod(final FMLConstructModEvent evt) {
        ClientModConstructor.construct(TradingPost.MOD_ID, TradingPostClient::new);
        DataProviderHelper.registerDataProviders(TradingPost.MOD_ID,
                ModLanguageProvider::new,
                ModModelProvider::new
        );
    }
}
