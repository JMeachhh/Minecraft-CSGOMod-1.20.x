package net.jake.csgomod.item;

import net.jake.csgomod.CSGOMod;
import net.jake.csgomod.item.custom.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CSGOMod.MOD_ID);


    // Currency
    public static final RegistryObject<Item> FIVE_POUND_NOTE = ITEMS.register("five_pound_note",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TWENTY_POUND_NOTE = ITEMS.register("twenty_pound_note",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FIFTY_POUND_NOTE = ITEMS.register("fifty_pound_note",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POUND_COIN = ITEMS.register("pound_coin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TEN_P_COIN = ITEMS.register("ten_p_coin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TWENTY_P_COIN = ITEMS.register("twenty_p_coin",
            () -> new Item(new Item.Properties()));

    // Guns
    public static final RegistryObject<Item> THE_EMPRESS = ITEMS.register("the_empress",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> SEE_YA_LATER = ITEMS.register("see_ya_later",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> LEADED_GLASS = ITEMS.register("leaded_glass",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> GOO = ITEMS.register("goo",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> MORRIS = ITEMS.register("morris",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> FIRE_SERPENT = ITEMS.register("fire_serpent",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> OFF_WORLD = ITEMS.register("off_world",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> GOLDEN_KOI = ITEMS.register("golden_koi",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> OCEAN_FOAM = ITEMS.register("ocean_foam",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> GRAPHITE = ITEMS.register("graphite",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> OVERGROWTH = ITEMS.register("overgrowth",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> BRIGHTWATER = ITEMS.register("brightwater",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> NEON_REVOLUTION = ITEMS.register("neon_revolution",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> ROLL_CAGE = ITEMS.register("roll_cage",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> FUEL_INJECTOR = ITEMS.register("fuel_injector",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> AIRLOCK = ITEMS.register("airlock",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> DIRECTIVE = ITEMS.register("directive",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> WEASEL = ITEMS.register("weasel",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> STARLIGHT_PROTECTOR = ITEMS.register("starlight_protector",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> NIGHTWISH = ITEMS.register("nightwish",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> NIGHT_TERROR = ITEMS.register("night_terror",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> RAPID_EYE_MOVEMENT = ITEMS.register("rapid_eye_movement",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> LIFTED_SPIRITS = ITEMS.register("lifted_spirits",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> SPIRIT_BOARD = ITEMS.register("spirit_board",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> ASIIMOV = ITEMS.register("asiimov",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> NEO_NOIR = ITEMS.register("neo_noir",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> FLASHBACK = ITEMS.register("flashback",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> OXIDE_BLAZE = ITEMS.register("oxide_blaze",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> MECHA_INDUSTRIES = ITEMS.register("mecha_industries",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> BLACK_SAND = ITEMS.register("black_sand",
            () -> new GunItem(new Item.Properties()));


    public static final RegistryObject<Item> HYPER_BEAST = ITEMS.register("hyper_beast",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> NEON_RIDER = ITEMS.register("neon_rider",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> WORM_GOD = ITEMS.register("worm_god",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> MONKEY_BUSINESS = ITEMS.register("monkey_business",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> ORIGAMI = ITEMS.register("origami",
            () -> new GunItem(new Item.Properties()));

    public static final RegistryObject<Item> VALENCE = ITEMS.register("valence",
            () -> new GunItem(new Item.Properties()));
    // Knives

    public static final RegistryObject<Item> BUTTERFLY_KNIFE = ITEMS.register("butterfly_knife",
            () -> new KnifeItem(new Item.Properties()));

    public static final RegistryObject<Item> DAMASCUS_STEEL = ITEMS.register("damascus_steel",
            () -> new KnifeItem(new Item.Properties()));

    public static final RegistryObject<Item> TIGER_TOOTH = ITEMS.register("tiger_tooth",
            () -> new KnifeItem(new Item.Properties()));

    public static final RegistryObject<Item> SLAUGHTER = ITEMS.register("slaughter",
            () -> new KnifeItem(new Item.Properties()));

    public static final RegistryObject<Item> FADE = ITEMS.register("fade",
            () -> new KnifeItem(new Item.Properties()));

    public static final RegistryObject<Item> GAMMA_DOPPPLER = ITEMS.register("gamma_doppler",
            () -> new KnifeItem(new Item.Properties()));

    public static final RegistryObject<Item> AUTOTRONIC = ITEMS.register("autotronic",
            () -> new KnifeItem(new Item.Properties()));

    public static final RegistryObject<Item> BLACK_LAMINATE = ITEMS.register("black_laminate",
            () -> new KnifeItem(new Item.Properties()));

    public static final RegistryObject<Item> LORE = ITEMS.register("lore",
            () -> new KnifeItem(new Item.Properties()));

    public static final RegistryObject<Item> SCORCHED = ITEMS.register("scorched",
            () -> new KnifeItem(new Item.Properties()));

    public static final RegistryObject<Item> CRISMON_WEB = ITEMS.register("crimson_web",
            () -> new KnifeItem(new Item.Properties()));

    public static final RegistryObject<Item> MARBLE_FADE = ITEMS.register("marble_fade",
            () -> new KnifeItem(new Item.Properties()));

    public static final RegistryObject<Item> ULTRAVIOLET = ITEMS.register("ultraviolet",
            () -> new KnifeItem(new Item.Properties()));


    // Keys
    public static final RegistryObject<Item> BASE_CASE_KEY = ITEMS.register("base_case_key",
            () -> new CSGOCaseKeyItem(new Item.Properties()));

    public static final RegistryObject<Item> CSGO_CASE_KEY = ITEMS.register("csgo_case_key",
            () -> new CSGOCaseKeyItem(new Item.Properties()));

    public static final RegistryObject<Item> CHROMA_TWO_CASE_KEY = ITEMS.register("chroma_two_case_key",
            () -> new CSGOCaseKeyItem(new Item.Properties()));

    public static final RegistryObject<Item> CLUTCH_CASE_KEY = ITEMS.register("clutch_case_key",
            () -> new CSGOCaseKeyItem(new Item.Properties()));

    public static final RegistryObject<Item> DANGER_ZONE_CASE_KEY = ITEMS.register("danger_zone_case_key",
            () -> new CSGOCaseKeyItem(new Item.Properties()));

    public static final RegistryObject<Item> DREAMS_AND_NIGHTMARES_CASE_KEY = ITEMS.register("dreams_and_nightmares_case_key",
            () -> new CSGOCaseKeyItem(new Item.Properties()));

    public static final RegistryObject<Item> GAMMA_TWO_CASE_KEY = ITEMS.register("gamma_two_case_key",
            () -> new CSGOCaseKeyItem(new Item.Properties()));

    public static final RegistryObject<Item> PRISMA_CASE_KEY = ITEMS.register("prisma_case_key",
            () -> new CSGOCaseKeyItem(new Item.Properties()));

    public static final RegistryObject<Item> SPECTRUM_TWO_CASE_KEY = ITEMS.register("spectrum_two_case_key",
            () -> new CSGOCaseKeyItem(new Item.Properties()));

    // Other
    public static final RegistryObject<Item> DEFUSE_KIT = ITEMS.register("defuse_kit",
            () -> new DefuseKitItem(new Item.Properties().stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
