package org.leeflower.lifetrade;

import org.bukkit.plugin.java.JavaPlugin;

public final class LifeTrade extends JavaPlugin {

    public static JavaPlugin instance;

    @Override
    public void onLoad() {
        saveDefaultConfig();
    }

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {
        saveConfig();
    }
}
