//MyGame.java

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Texture;

public class MyGame extends ApplicationAdapter  {

    private Texture texture;
    private SpriteBatch batch;

    public void create() {
        texture = new Texture("assets/world.png"); // We create a texture to load a single image
        batch = new SpriteBatch(); // The tool we use to draw images
    }

    public void render() {
        // Clear the screen with a solid color (Red, Green, Blue, Alpha)
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        // Drawing happens here!
        batch.draw(texture, 192, 112);
        batch.end();
    }
}