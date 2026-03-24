//DesktopLauncher.java

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class DesktopLauncher {
    
    public static void main (String[] arg) {
        
        // 1. Create a configuration object to set game settings
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        
        // 2. Set the title and icon at the top of the window
        config.setTitle("My Epic Game");
        config.setWindowIcon("assets/logo.png");
        
        // 3. Set the window width and height in pixels
        config.setWindowedMode(800, 600);
        
        // 4. Lock the game to 60 Frames Per Second so it doesn't run too fast
        config.setForegroundFPS(60);
        
        // 5. Start the engine and load MyGame with our settings!
        new Lwjgl3Application(new MyGame(), config);
    }
}