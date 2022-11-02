/* Package */
package com.main.entity.sprite;

/* Import main */
import com.main.Config;

/* Import util */
import java.util.Set;

/* Class Player extends Sprite */
public class Player extends Sprite {

	/* Speed */
	private int speed = 2;
	private int limit = 12; // speed limit

	/* Constructor */
	public Player() {

		/* Set player image */
		setImage("assets/player.png");

	}

	/* Move */
	public void move(Set<Integer> keys) {

		/* Vertical direction */
		if(keys.contains(38)) 		dirY = -1;
		else if(keys.contains(40)) 	dirY = 1;
		else 						dirY = 0;

		/* Horizontal direction */
		if(keys.contains(37)) 		dirX = -1;
		else if(keys.contains(39)) 	dirX = 1;
		else 						dirX = 0;

		/* Acceleration */
		verticalMove();
		horizontalMove();

		/* Player move */
		x += dx;
		y += dy;

		/*  */
		if(x < 0) x = 0;
		else if(x > Config.SCREEN[0] - width)
			x = Config.SCREEN[0] - width;

		if(y < 0) y = 0;
		else if(y > Config.SCREEN[1] - height)
			y = Config.SCREEN[1] - height;
	
	}

	/* Vertical move */
	private void verticalMove() {

		/* Move */
		if(dirY != 0) {
			dy += dirY * speed;
			if(Math.abs(dy) > limit) {
				dy = dirY * limit;
			}
		}

		/* Stop */
		else {
			dy *= 0.8;
			if(Math.abs(dy) < 0.1) {
				dy = 0;
			}
		}

	}

	/* Horizontal move */
	private void horizontalMove() {

		/* Move */
		if(dirX != 0) {
			dx += dirX * speed;
			if(Math.abs(dx) > limit) {
				dx = dirX * limit;
			}
		}

		/* Stop */
		else {
			dx *= 0.8;
			if(Math.abs(dx) < 0.1) {
				dx = 0;
			}
		}

	}

}