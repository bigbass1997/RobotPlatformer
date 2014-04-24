package tm.info.bigbass1997.game.states;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import tm.info.bigbass1997.game.GameStateManager;

public class PlayState extends GameState {

	public PlayState(GameStateManager gsm) {
		super(gsm);
	}

	@Override
	public void init() {
		
	}

	@Override
	public void update(float delta) {
		gsm.player.update(delta);
	}

	@Override
	public void draw(ShapeRenderer sr) {
		gsm.player.draw(sr);
	}
	
}
