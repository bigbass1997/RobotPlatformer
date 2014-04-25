package tm.info.bigbass1997.game.entities;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

public class StaticBody {
	
	private BodyDef bodyDef;
	private Body body;
	
	
	private String name;
	private float x, y;
	private float width, height;
	
	private World world;
	
	private PolygonShape shape;
	
	public StaticBody(String name, float x, float y, float width, float height, World world){
		this.name = name;
		this.x = x;
		this.y = y;
		this.world = world;
		
		bodyDef = new BodyDef();
		bodyDef.position.set(new Vector2(x, y));
		
		body = world.createBody(bodyDef);
		
		shape = new PolygonShape();
		shape.setAsBox(width, height);
		
		body.createFixture(shape, 0.0f);
		
		shape.dispose();
	}
}
