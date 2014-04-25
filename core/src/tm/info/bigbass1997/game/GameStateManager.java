package tm.info.bigbass1997.game;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;

import tm.info.bigbass1997.game.entities.Player;
import tm.info.bigbass1997.game.states.GameState;
import tm.info.bigbass1997.game.states.MenuState;
import tm.info.bigbass1997.game.states.PlayState;

public class GameStateManager {
	
	private GameState gameState;
	private int currentState;
	
	public Player player;
	private ShapeRenderer sr;
	
	public World world;
	public Box2DDebugRenderer debugRenderer;
	
	public final int MENUSTATE = 0;
	public final int PLAYSTATE = 1;
	
	public GameStateManager(){
		world = new World(new Vector2(0, -10), true);
		debugRenderer = new Box2DDebugRenderer();
		
		player = new Player(this);
		sr = new ShapeRenderer();
	}
	
	public void setState(int state){
		switch(state){
		case MENUSTATE:
			gameState = new MenuState(this);
			currentState = state;
			break;
		case PLAYSTATE:
			gameState = new PlayState(this);
			currentState = state;
			break;
		default:
			System.out.println("STATE PROVIDED IS NOT VALID!");
			break;
		}
	}
	
	public void update(float delta){
		gameState.update(delta);
	}
	
	public void draw(){
		gameState.draw(sr);
	}
	
	public int getCurrentState(){
		return currentState;
	}
	public GameState getGameState(){
		return gameState;
	}
}
