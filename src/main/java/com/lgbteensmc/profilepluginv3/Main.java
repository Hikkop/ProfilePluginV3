package com.lgbteensmc.profilepluginv3;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public final class Main extends JavaPlugin {
    @Override
    public void onEnable() {
    	getLogger().info("ProfilePluginV3 is loaded!");
    }
 
    @Override
    public void onDisable() {
    	getLogger().info("ProfilePluginV3 has been unloaded.");
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if (cmd.getName().equalsIgnoreCase("basic2")) {
    		if (!(sender instanceof Player)) {
    			sender.sendMessage("This command can only be run by a player.");
    		} else {
    			Player player = (Player) sender;
    			sender.sendMessage("Setprofile running");
    		}
    		return true;
    	}
    	return false;
    }
    
    
    
}
