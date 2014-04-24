package tm.info.bigbass1997.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import tm.info.bigbass1997.game.GraphicsMain;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "RobotPlatformer";
		config.width = 720;
		config.height = 620;
		new LwjglApplication(new GraphicsMain(), config);
	}
}
