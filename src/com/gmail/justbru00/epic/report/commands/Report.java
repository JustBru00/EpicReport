package com.gmail.justbru00.epic.report.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.justbru00.epic.report.utils.Messager;

public class Report implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
		
		if (command.getName().equalsIgnoreCase("report")) {
			if (sender.hasPermission("epicreport.report")) {
				if (sender instanceof Player) {
					if (args.length > 1) {
						Player player = (Player) sender;
						Player reporting = null;
						
						try {
							reporting = Bukkit.getPlayer(args[0]);
						} catch (Exception e) {
							Messager.msgPlayer(player, "&cThat player was not found.");
							return true;
						}
						
						
						
					} else {
						Messager.msgSender("&cUse the command like this: &f/report <name> <reason>", sender);
						return true;
					}
				} else {
					Messager.msgSender("&cSorry that command can only be used by a player.", sender);
					return true;
				}
			} else {
				Messager.msgSender("&cYou don't have permission.", sender);
				return true;
			}
		}
		
		return false;
	}

}
