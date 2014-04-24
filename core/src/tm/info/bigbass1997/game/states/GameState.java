package tm.info.bigbass1997.game.states;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import tm.info.bigbass1997.game.GameStateManager;

public abstract class GameState {
	
	protected GameStateManager gsm;
	
	protected GameState(GameStateManager gsm){
		this.gsm = gsm;
		
		init();
	}
	
	public abstract void init();
	public abstract void update(float delta);
	public abstract void draw(ShapeRenderer sr);
	
	public void dispose(){
		
	}
}
