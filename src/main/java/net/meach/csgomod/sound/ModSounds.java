package net.meach.csgomod.sound;

import net.meach.csgomod.CSGOMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CSGOMod.MOD_ID);

    public static final RegistryObject<SoundEvent> BOMB_START_DEFUSE = registerSoundEvents("bomb_start_defuse");
    public static final RegistryObject<SoundEvent> BOMB_PLACED_AND_TICKING = registerSoundEvents("bomb_placed_and_ticking");
    public static final RegistryObject<SoundEvent> BOMB_DEFUSE = registerSoundEvents("bomb_defuse");
    public static final RegistryObject<SoundEvent> BOMB_EXPLODE = registerSoundEvents("bomb_explode");
    public static final RegistryObject<SoundEvent> CASE_PLACED = registerSoundEvents("case_placed");
    public static final RegistryObject<SoundEvent> CASE_UNLOCKED = registerSoundEvents("case_unlocked");
    public static final RegistryObject<SoundEvent> CASE_OPEN = registerSoundEvents("case_open");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(CSGOMod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
