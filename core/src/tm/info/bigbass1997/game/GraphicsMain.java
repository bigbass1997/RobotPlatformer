package tm.info.bigbass1997.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GraphicsMain extends ApplicationAdapter {
	
	public static OrthographicCamera camera;
	public SpriteBatch batch;
	
	public static float sWidth, sHeight;
	
	public GameStateManager gsm;
	
	@Override
	public void create() {
		sWidth = Gdx.graphics.getWidth();
		sHeight = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera(sWidth, sHeight);
		camera.setToOrtho(false, sWidth, sHeight);
		
		batch = new SpriteBatch();
		
		gsm = new GameStateManager();
		gsm.setState(gsm.PLAYSTATE);
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.setProjectionMatrix(camera.combined);

		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.draw();
	}
	
	@Override
	public void dispose(){
		batch.dispose();
	}
}
