/*package com.lgbteensmc.profilepluginv3;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

import lib.PatPeter.SQLibrary.Database;
import lib.PatPeter.SQLibrary.SQLite;

public class DatabaseManager extends JavaPlugin{
	private static Database sqldb;
	public static void CreateDatabase(){
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
*/