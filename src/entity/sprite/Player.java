/* Package */
package com.main.entity.sprite;

/* Import main */
import com.main.Config;

/* Import util */
import java.util.Set;

/* Class Player extends Sprite */
public class Player extends Sprite {

	/* Speed */
	private float speed = 2;
	private float speedStop = 0.8f;
	private float limit = 12; // speed limit

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
		dx = acceleration("h");
		dy = acceleration("v");

		/* Player move */
		x += dx;
		y += dy;

		/* Move limit */
		x = move_limit(0);
		y = move_limit(1);
	
	}

	/* Acceleration */
	private float acceleration(String axis) {
		int dir = (axis == "h") ? dirX : dirY;
		float ax = (axis == "h") ? dx : dy;

		/* Move */
		if(dir != 0) {
			ax += dir * speed;
			if(Math.abs(ax) > limit) {
				ax = dir * limit;
			}
		}

		/* Stop */
		else {
			ax *= speedStop;
			if(Math.abs(ax) < 0.1) {
				ax = 0;
			}
		}

		return ax;
	}

	/* Move limit */
	private int move_limit(int axis) {
		int p = (axis == 0) ? x : y;
		int size = (axis == 0) ? width : height;

		if(p < 0) p = 0;
		else if(p > Config.SCREEN[axis] - size)
			p = Config.SCREEN[axis] - size;
		else p = p;

		return p;
	}

}