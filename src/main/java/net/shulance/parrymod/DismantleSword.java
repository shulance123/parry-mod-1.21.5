package net.shulance.parrymod;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerAbilities;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.inventory.StackReference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.consume.UseAction;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.slot.Slot;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class DismantleSword extends Item{
    public DismantleSword(Settings settings) {
        super(settings);
    }



    /*@Override
    public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        LightningEntity lightningBolt = new LightningEntity(EntityType.LIGHTNING_BOLT, attacker.getWorld());
        lightningBolt.setPosition(target.getPos());
        attacker.getWorld().spawnEntity(lightningBolt);
        ArrowEntity arrowEntity = new ArrowEntity(EntityType.ARROW, attacker.getWorld());
        attacker.getWorld().spawnEntity(arrowEntity);
        super.postHit(stack, target, attacker);
    }*/
}
