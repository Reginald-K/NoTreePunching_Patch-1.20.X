package net.reginald.notreepunching_patch.item;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

public class ModCreativeModeTabs {
    // Registers the new Items
    public static void registerNew(BuildCreativeModeTabContentsEvent event){
        event.accept(ModItems.AMETHYST_KNIFE);
    }

    // Registers the Items from notreepunching, that have been omitted in the original mod.
    public static void registerMissing(BuildCreativeModeTabContentsEvent event){

        String[] names = {
                // Ceramics
                "ceramic_large_vessel",
                // Clay Items
                // omitting clay_worked
                "clay_large_vessel",
                "clay_small_vessel",
                "clay_bucket",
                "clay_flower_pot",
                // Cobblestones
                "andesite_cobblestone",
                "andesite_cobblestone_stairs",
                "andesite_cobblestone_slab",
                "andesite_cobblestone_wall",
                "diorite_cobblestone",
                "diorite_cobblestone_stairs",
                "diorite_cobblestone_slab",
                "diorite_cobblestone_wall",
                "granite_cobblestone",
                "granite_cobblestone_stairs",
                "granite_cobblestone_slab",
                "granite_cobblestone_wall",
                // Loose Stones
                "stone_loose_rock",
                "sandstone_loose_rock",
                "red_sandstone_loose_rock",
                "andesite_loose_rock",
                "diorite_loose_rock",
                "granite_loose_rock"
        };

        for(String name:names){
            ResourceLocation item_id =
                    ResourceLocation.fromNamespaceAndPath("notreepunching", name);

            Item item = BuiltInRegistries.ITEM.get(item_id);

            if (item != Items.AIR) {
                event.accept(item);
            }
        }

    }
}
