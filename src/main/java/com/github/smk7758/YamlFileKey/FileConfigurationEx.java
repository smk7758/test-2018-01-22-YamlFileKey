package com.github.smk7758.YamlFileKey;

import org.bukkit.configuration.file.FileConfiguration;

public abstract class FileConfigurationEx extends FileConfiguration {
	public String getString(SettingKeys key) {
		return super.getString(key.toString());
	}

	public void set(SettingKeys key) {
		super.set(key.toString(), key.getText());
	}
}