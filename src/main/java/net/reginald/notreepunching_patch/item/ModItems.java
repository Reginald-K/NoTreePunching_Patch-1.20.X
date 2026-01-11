package net.reginald.notreepunching_patch.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.reginald.notreepunching_patch.NoTreePunching_Patch;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NoTreePunching_Patch.MODID);

    //region Custom Items
    /*
    public static final RegistryObject<Item> AMETHYST_KNIFE = ITEMS.register(
            "amethyst_knife",
            () -> new Item(new Item.Properties())
    );
    */
    //endregion

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
