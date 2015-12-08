package com.triforce_archscratch.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.triforce_archscratch.TriForceArchScratch;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new TriForceArchScratch(), config);
		config.height = 600; //Set the height, width, and title of the screen. Disable the option to make the screen larger.
		config.width = 400;
		config.title = "TriForce Arch Scratch!";
		config.resizable = false;
	}
}
