package itzshmulik.survivelist.survivelistcombat;

import itzshmulik.survivelist.survivelistcombat.Events.OnPunch;
import org.bukkit.plugin.java.JavaPlugin;

public final class SurvivelistCombat extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new OnPunch(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
