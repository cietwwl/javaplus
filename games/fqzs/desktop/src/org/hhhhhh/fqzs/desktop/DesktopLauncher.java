package org.hhhhhh.fqzs.desktop;

import org.hhhhhh.fqzs.core.App;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class DesktopLauncher {
	private static final double X = 1;

	public static void main(String[] arg) {
		App app = new App();
		app.setLoginUI(new DesktopLoginUI());
		app.setRoleUI(new DesktopRoleUI());
		app.setMessageUI(new DesktopMessageUI());
		new LwjglApplication(app, "fqzs", (int)(760 * X), (int) (1280 * X));
	}
}
