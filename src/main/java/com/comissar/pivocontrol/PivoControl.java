package com.comissar.pivocontrol;

import com.comissar.pivocontrol.listeners.ArmorSlotsListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class PivoControl extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(new ArmorSlotsListener(this), this);

    }

    @Override
    public void onDisable() {

    }
}
