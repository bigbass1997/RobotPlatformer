package tm.info.bigbass1997.game.entities;

import tm.info.bigbass1997.game.GameStateManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Player extends GameObject {

	private DynamicBody body;
	
	public Player(GameStateManager gsm){
		super(gsm);
		body = new DynamicBody("ball", 100, 100, 1.0f, 0.0f, 0.0f, DynamicBody.POLYGON, gsm.world);
		vel = body.body.getLinearVelocity();
		MAX_VELOCITY = 1000.0f;
	}

	@Override
	public void update(float delta) {
		if(Gdx.input.isKeyPressed(Keys.LEFT)){
			body.body.setLinearVelocity(-30.0f, body.body.getLinearVelocity().y);
		}else{
			body.body.setLinearVelocity(0.0f, body.body.getLinearVelocity().y);
		}
		
		if(Gdx.input.isKeyPressed(Keys.RIGHT)){
			body.body.setLinearVelocity(30.0f, body.body.getLinearVelocity().y);
		}else{
			body.body.setLinearVelocity(0.0f, body.body.getLinearVelocity().y);
		}
		
		System.out.println(body.body.getLinearVelocity().x);
	}

	@Override
	public void draw(ShapeRenderer sr) {
		
	}
}
