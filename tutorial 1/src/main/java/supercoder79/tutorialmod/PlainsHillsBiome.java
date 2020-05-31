package supercoder79.tutorialmod;

import com.google.common.collect.ImmutableList;

import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

public class PlainsHillsBiome extends Biome {

	public PlainsHillsBiome() {
		super(new Biome.Settings()
			.configureSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
			.precipitation(Biome.Precipitation.RAIN)
			.category(Biome.Category.PLAINS)
			.depth(0.525F)
			.scale(0.65F)
			.temperature(0.8F)
			.downfall(0.4F)
			.effects(new BiomeEffects.Builder()
				.waterColor(4159204)
				.waterFogColor(329011)
				.fogColor(12638463)
				.moodSound(BiomeMoodSound.CAVE).build())
			.parent(null)
			.noises(ImmutableList.of(new Biome.MixedNoisePoint(0.0F, 0.0F, 0.0F, 0.0F, 1.0F))));

	}
}
