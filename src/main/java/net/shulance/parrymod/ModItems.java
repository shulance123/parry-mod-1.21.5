package net.shulance.parrymod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        //creates the time key
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ParryMod.MOD_ID, name));

        //creates item instance
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        //register the item
        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    public static final Item DISMANTLE_SWORD = register("dismantle_sword", settings -> new DismantleSword(settings), new Item.Settings().sword(ToolMaterial.IRON, 3, -2.4f));

    public static void initalize() {
        // Get the event for modifying entries in the ingredients group.
        // And register an event handler that adds our suspicious item to the ingredients group.
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemgroup) -> itemgroup.add(ModItems.DISMANTLE_SWORD));
    }
}