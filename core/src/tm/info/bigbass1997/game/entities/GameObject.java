package tm.info.bigbass1997.game.entities;

import java.awt.Point;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public abstract class GameObject {
	
	protected float x, y;
	protected float dx, dy;
	
	protected float width, height;
	
	protected float speed;
	
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
