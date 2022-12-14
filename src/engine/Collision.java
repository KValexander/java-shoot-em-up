/* Package */
package com.main.engine;

/* Import main */
import com.main.Config;
import com.main.Game;

/* Import entity */
import com.main.entity.Entity;

/* Import entity sprite */
import com.main.entity.sprite.Sprite;

/* Import awt */
import java.awt.Rectangle;

/* Class Collision */
public class Collision extends Engine {

	/* Constructor */
	public Collision(Game game) {
		super(game);
	}

	/* Collision handling */
	public void collision() {

		/* Sprite collision */
		sprite_collision();

	}

	/* Sprite collision */
	private void sprite_collision() {

		for(Sprite s1 : sprites) {

			Rectangle r1 = s1.getBounds();
			s1.setCollision(false);

			for(Sprite s2 : sprites) {

				Rectangle r2 = s2.getBounds();

				if(s1 != s2) {

					if(r1.intersects(r2)) {

						s1.setCollision(true);
						s2.setCollision(true);

					}

				}

			}

		}

	}

}