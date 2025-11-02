package com.jamesphbennett.nobedrespawn;

import org.bukkit.plugin.java.JavaPlugin;

public class NoBedRespawn extends JavaPlugin {

    @Override
    public void onEnable() {
        // Register the event listener
        getServer().getPluginManager().registerEvents(new BedListener(), this);
        
        getLogger().info("NoBedRespawn has been enabled!");
        getLogger().info("Players can sleep in beds but won't set respawn points.");
    }

    @Override
    public void onDisable() {
        getLogger().info("NoBedRespawn has been disabled!");
    }
}
