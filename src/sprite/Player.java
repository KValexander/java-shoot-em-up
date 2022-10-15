/* Package */
package com.main.sprite;

/* Import util */
import java.util.Set;

/* Class Player extends Sprite */
public class Player extends Sprite {

	/* Constructor */
	public Player() {

		/* Set player image */
		setImage("assets/player.png");

	}

	/* Move */
	public void move(Set<Integer> keys) {

		/* Move top */
		if(keys.contains(38)) {
			dy -= 2;
			if(dy < -12) {
				dy = -12;
			}
		}

		/* Move bottom */
		else if(keys.contains(40)) {
			dy += 2;
			if(dy > 12) {
				dy = 12;
			}
		}

		/* Stop move */
		else {
			dy *= 0.8;
			if(Math.abs(dy) < 0.1) {
				dy = 0;
			}
		}

		/* Move left */
		if(keys.contains(37)) {
			dx -= 2;
			if(dx < -13) {
				dx = -13;
			}
		}

		/* Move right */
		else if(keys.contains(39)) {
			dx += 2;
			if(dx > 13) {
				dx = 13;
			}
		}

		/* Stop move */
		else {
			dx *= 0.8;
			if(Math.abs(dx) < 0.1) {
				dx = 0;
			}
		}

		/* Player move */
		x += dx;
		y += dy;

	}

}