package com.gmail.justbru00.epic.report.utils;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUI {
	
	

	public static Inventory openReportGUI(Player reporter, Player reporting, String reason) {
		Inventory inv = Bukkit.createInventory(null, 54, Messager.color("&4Reporting " + reporting.getName()));
		
		ItemStack reasonHacking = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta reasonHackingMeta = reasonHacking.getItemMeta();
		reasonHackingMeta.setDisplayName(Messager.color("&c&lHacking"));
		ArrayList<String> reasonHackingLore = new ArrayList<String>();
		reasonHackingLore.add(Messager.color("&7Kill aura, flying, speed, etc."));
		reasonHackingMeta.setLore(reasonHackingLore);
		reasonHacking.setItemMeta(reasonHackingMeta);
		
		inv.setItem(11, reasonHacking);
		//TODO finish gui
		
		return null;
	}
}
