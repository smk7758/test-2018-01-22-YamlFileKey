package com.github.smk7758.YamlFileKey;

import org.bukkit.configuration.file.FileConfiguration;

import com.github.smk7758.YamlFileKey.FileTest.TestKeys;

public class FileTest extends FileManager<TestKeys> {

	public FileTest(FileConfiguration fc) {
		super(fc);
	}

	public enum TestKeys implements SettingKeys {
		test(""), test1("");

		private String text;

		private TestKeys(String text) {
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
}
