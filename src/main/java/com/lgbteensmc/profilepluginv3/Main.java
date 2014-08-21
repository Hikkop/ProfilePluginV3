package com.lgbteensmc.profilepluginv3;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.File;
import java.util.logging.Logger;

import lib.PatPeter.SQLibrary.*;

public final class Main extends JavaPlugin {
    @Override
    public void onEnable() {
    	getLogger().info("ProfilePluginV3 is loaded!");
    	File plugindatafolder = getDataFolder(); 
    	if (!plugindatafolder.exists()) {
    		getLogger().info("[ProfilePluginV3] Folder does not exist - creating");
    	    plugindatafolder.mkdir();
    	}
    	File databasefile = new File(plugindatafolder, "profiledata.db");
    	if (!databasefile.exists()) {
    		getLogger().info("[ProfilePluginV3] Database file does not exist - creating");
    		Database sqldb;
    		sqldb = new SQLite(Logger.getLogger("profiledata"),
    				"[ProfilePlugin] ",
    				getDataFolder().getAbsolutePath(), 
    				"ProfileData",
    				".sqlite");
    		if (!sqldb.isOpen()) {
    		    sqldb.open();
    		}
    	}
    }
 
    @Override
    public void onDisable() {
    	getLogger().info("ProfilePluginV3 has been unloaded.");
    }
    
    @Override
    //Set Profile Command
    //  - Check if player, is so, send to correct class
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if (cmd.getName().equalsIgnoreCase("setprofile")) {
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
