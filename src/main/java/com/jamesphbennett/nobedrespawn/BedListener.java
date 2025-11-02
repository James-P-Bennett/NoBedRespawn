package com.jamesphbennett.nobedrespawn;

import com.destroystokyo.paper.event.player.PlayerSetSpawnEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class BedListener implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerBedEnter(PlayerBedEnterEvent event) {
        // Allow the player to sleep but don't set respawn point
        // The actual respawn point prevention is handled in onPlayerSetSpawn
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerSetSpawn(PlayerSetSpawnEvent event) {
        Player player = event.getPlayer();

        // Check if player has bypass permission
        if (player.hasPermission("nobedrespawn.bypass")) {
            return; // Allow normal bed respawn for players with bypass permission
        }

        // Cancel the event to prevent the respawn point from being set
        event.setCancelled(true);
    }
}
