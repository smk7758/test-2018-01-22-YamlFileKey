package com.github.smk7758.YamlFileKey;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class SendLog {
	public static final String chat_prefix = "[" + ChatColor.GREEN + Main.plugin_name + ChatColor.RESET + "] ";
	public static final String console_prefix = "[" + Main.plugin_name + "] ";
	public static final String error_prefix = ChatColor.RED + "[" + ChatColor.RESET + Main.plugin_name + ChatColor.RED + "] " + ChatColor.RESET;
	public static final String debug_prefix = chat_prefix + "[Debug] ";
	public static final Logger logger = Logger.getLogger("Minecraft");

	private SendLog() {
	}

	public static void send(String text, CommandSender sender) {
		sender.sendMessage(chat_prefix + text);
	}

	public static void error(String text, CommandSender sender) {
		sender.sendMessage(error_prefix + text);
	}

	public static void debug(String text, CommandSender sender) {
		if (Main.debug_mode) sender.sendMessage(debug_prefix + text);
	}

	public static void info(String text) {
		logger.info(console_prefix + text);
	}

	public static void warn(String text) {
		logger.warning(console_prefix + text);
	}

	public static void sendPermissionErrorMessage(String permission, CommandSender sender) {
		sender.sendMessage(error_prefix + "You don't have Permission.");
		debug("NoPermission:" + permission, sender);
	}

	public static void sendBroadCast(String text) {
		Bukkit.getServer().broadcastMessage(text);
	}

	public static void sendBroadCast(String text, String permission) {
		Bukkit.getServer().broadcast(text, permission);
	}
}