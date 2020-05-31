package supercoder79.tutorialmod;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biomes.v1.OverworldBiomes;

public class TutorialMod implements ModInitializer {
	public static Biome PLAINS_HILLS;

	@Override
	public void onInitialize() {
		PLAINS_HILLS = Registry.register(Registry.BIOME, new Identifier("tutorialmod", "plains_hills"), new PlainsHillsBiome());
		OverworldBiomes.addHillsBiome(Biomes.PLAINS, PLAINS_HILLS, 1.0);
	}
}
