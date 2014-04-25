package tm.info.bigbass1997.game.entities;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.Shape;
import com.badlogic.gdx.physics.box2d.World;

public class DynamicBody {
	
	public static final int CIRCLE = 0;
	public static final int POLYGON = 1;
	
	private BodyDef bodyDef;
	public Body body;
	
	private FixtureDef fixtureDef;
	private Fixture fixture;
	
	public String name;
	public float x, y;
	private float density, friction, restitution;
	
	private World world;
	
	private Shape shape;
	
	public DynamicBody(String name, float x, float y, float density, float friction, float restitution, int type, World world){
		this.name = name;
		this.x = x;
		this.y = y;
		this.density = density;
		this.friction = friction;
		this.restitution = restitution;
		this.world = world;
		
		bodyDef = new BodyDef();
		bodyDef.type = BodyType.DynamicBody;
		bodyDef.position.set(x, y);
		
		System.out.println(world + " | " + bodyDef);
		
		body = world.createBody(bodyDef);
		
		if(type == CIRCLE){
			shape = new CircleShape();
			shape.setRadius(10.0f);
		}
		if(type == POLYGON){
			shape = new PolygonShape();
			((PolygonShape) shape).setAsBox(10.0f, 10.0f);
		}
		
		fixtureDef = new FixtureDef();
		fixtureDef.shape = shape;
		fixtureDef.density = density;
		fixtureDef.friction = friction;
		fixtureDef.restitution = restitution;
		
		fixture = body.createFixture(fixtureDef);
		
		shape.dispose();
	}
}
