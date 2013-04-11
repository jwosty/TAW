package jw.taw.client;

import net.minecraftforge.client.MinecraftForgeClient;
import jw.taw.common.CommonProxy;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(TEXTURES_PNG);
	}
}
