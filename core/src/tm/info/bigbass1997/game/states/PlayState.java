package tm.info.bigbass1997.game.states;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import tm.info.bigbass1997.game.GameStateManager;
import tm.info.bigbass1997.game.GraphicsMain;
import tm.info.bigbass1997.game.entities.DynamicBody;
import tm.info.bigbass1997.game.entities.StaticBody;

public class PlayState extends GameState {
	
	private StaticBody ground;
	
	public PlayState(GameStateManager gsm) {
		super(gsm);
	}

	@Override
	public void init() {
		ground = new StaticBody("ground", 0, 10, GraphicsMain.sWidth, 20, gsm.world);
	}

	@Override
	public void update(float delta) {
		gsm.player.update(delta);
		gsm.world.step(1.0f / 60.0f, 6, 2);
	}

	@Override
	public void draw(ShapeRenderer sr) {
		gsm.player.draw(sr);
		gsm.debugRenderer.render(gsm.world, GraphicsMain.camera.combined);
	}
	
}
