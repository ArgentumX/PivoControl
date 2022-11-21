package com.comissar.pivocontrol.listeners;

import com.comissar.pivocontrol.PivoControl;
import com.destroystokyo.paper.event.player.PlayerArmorChangeEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.Cancellable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockGrowEvent;

public class ArmorSlotsListener implements Listener {

    private PivoControl plugin;
    public ArmorSlotsListener (PivoControl plugin){
        this.plugin = plugin;
    }
    @EventHandler
    public void OnSlot(PlayerArmorChangeEvent e) {

        if (e.getNewItem().getType() == Material.ELYTRA) {
            e.getPlayer().getWorld().dropItem(e.getPlayer().getLocation(), e.getNewItem());
            e.getPlayer().getInventory().setChestplate(null);
        }

    }
}
