package tm.info.bigbass1997.game.entities;

import java.awt.Point;

import tm.info.bigbass1997.game.GameStateManager;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

public abstract class GameObject {
	
	protected float x, y;
	protected float dx, dy;
	
	protected float width, height;
	
	protected float speed;

	public Vector2 vel;
	public float MAX_VELOCITY;
	
	public GameStateManager gsm;
	
	public GameObject(GameStateManager gsm){
		this.gsm = gsm;
	}
	
	public abstract void update(float delta);
	public abstract void draw(ShapeRenderer sr);
	
	public float getX(){
		return x;
	}

	public float getY(){
		return y;
	}

	public float getWidth(){
		return width;
	}

	public float getHeight(){
		return height;
	}

	public float getXAxisCenter(){
		return width / 2;
	}

	public float getYAxisCenter(){
		return height / 2;
	}

	public Point getCenter(){
		return new Point((int) getXAxisCenter(), (int) getYAxisCenter());
	}
}
