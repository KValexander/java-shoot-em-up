/* Package */
package com.main.entity.sprite;

/* Import main */
import com.main.Config;

/* Import entity */
import com.main.entity.Entity;

/* Class Sprite */
public class Sprite extends Entity {

	private boolean collision = false; // collision state
	public boolean debug = true; // debug

	/* Acceleration */
	float dx = 0;
	float dy = 0;
	
	/* Set position (string) */
	public void setPos(String namePosition) {

		/* Width centering */
		x = Config.SCREEN[0] / 2 - width / 2;

		/* Prepared positions */
		switch (namePosition) {

			/* Top position */
			case "top":
				y = 0;
			break;

			/* Center position */ 
			case "center":
				y = Config.SCREEN[1] / 2 - height / 2; 
			break;

			/* Down position */
			case "down":
				y = Config.SCREEN[1] - (height + height / 2); 
			break;

		}
		
	}

	/* Set collision */
	public void setCollision(boolean collision) {
		this.collision = collision;
	}

	/* Check collision */
	public boolean onCollision() {
		return collision;
	}

}