package itzshmulik.survivelist.survivelistcombat.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class OnPunch implements Listener {

    public boolean isInCombat;

    @EventHandler
    public void OnHit(EntityDamageByEntityEvent event) {
        if (event.getEntity() instanceof Player && event.getDamager() instanceof Player) {
            Player Attacker = (Player) event.getDamager();
            Player Attacked = (Player) event.getEntity();

            if(isInCombat == true){

            }

            if (Attacker.getWorld().getName() == "Events" && Attacked.getWorld().getName() == "Events") {
                isInCombat = true;
            }
        }
    }
}

