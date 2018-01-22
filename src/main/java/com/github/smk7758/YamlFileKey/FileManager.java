package com.github.smk7758.YamlFileKey;

import org.bukkit.configuration.file.FileConfiguration;

import com.github.smk7758.YamlFileKey.FileManager.T;

public class FileManager<T> {
	FileConfigurationEx fc = null;

	public FileManager(FileConfiguration fc) {
		this.fc = (FileConfigurationEx) fc;
	}

	public enum T implements SettingKeys {
		;

		private String text;

		private T(String text) {
			this.setText(text);
		}

		@Override
		public String getText() {
			return text;
		}

		@Override
		public void setText(String text) {
			this.text = text;
		}
	}

	public void reload() {
		for (T key : T.values()) {
			key.setText(fc.getString(key));
		}
	}

	public void save() {
		for (FileManager.T key : T.values()) {
			fc.set(key);
		}
	}
}