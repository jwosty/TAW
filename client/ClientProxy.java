package jw.taw.client;

import jw.taw.common.CommonProxy;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(TEXTURES_PNG);
	}
}
