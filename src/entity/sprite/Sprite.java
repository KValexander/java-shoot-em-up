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

	/* Direction */
	int dirX = 0;
	int dirY = 0;

	/* Acceleration */
	float dx = 0;
	float dy = 0;
	
	/* Set collision */
	public void setCollision(boolean collision) {
		this.collision = collision;
	}

	/* Check collision */
	public boolean onCollision() {
		return collision;
	}

}