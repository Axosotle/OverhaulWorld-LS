package net.lost_souls.overhaulworld.worldgen;


import com.example.yourmod.YourMod;
import com.example.yourmod.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.common.world.Modifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBiomeModifiers {



    TreeDecorator
    public static final DeferredRegister<Modifier> MODIFIERS = DeferredRegister.create(ForgeRegistries.MODIFIERS, YourMod.MODID);

    public static final RegistryObject<Modifier> PEBBLE_MODIFIER = MODIFIERS.register("pebble_modifier",
            () -> new Modifier() {
                @Override
                public void apply(Holder<Biome> biome, BiomeGenerationSettingsBuilder generation, MobSpawnSettings.Builder spawns) {
                    generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.PEBBLE_PLACED.getHolder().get());
                }
            });

}

