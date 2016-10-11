package com.gmail.justbru00.epic.report.main;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.justbru00.epic.report.utils.Debug;
import com.gmail.justbru00.epic.report.utils.Messager;

public class Main extends JavaPlugin {
	
	private static Main plugin;
	public static boolean debug = false;
	public static String prefix = Messager.color("&8[&bEpic&fReport&8] &f");
	public static ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
	public static Logger bukkitLogger = Bukkit.getLogger();

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		return false;
	}

	@Override
	public void onDisable() {
		
		plugin = null; // Close weird memory leak.
	}

	@Override
	public void onEnable() {
		plugin = this; // Set the instance of the plugin.
		
		
	}
	
	public static Main getInstance() {
		if (plugin == null) {
			Debug.send("Plugin in Main#getInstance() is null. WHAT DID YOU DO!?");
		}
		return plugin;
	}
	
}
