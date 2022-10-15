/* Package */
package com.main.engine;

/* Import main */
import com.main.Config;
import com.main.Game;

/* Import sprite */
import com.main.sprite.Sprite;

/* Import awt */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/* Class Render */
public class Render extends Engine {
	
	/* Constructor */
	public Render(Game game) {
		super(game);
	}

	/* Rendering game objects */
	public void render(Graphics2D g2d) {

		/* Rendering background */
		g2d.setColor(Color.white);
		g2d.fillRect(0, 0, Config.SCREEN[0], Config.SCREEN[1]);

		/* Rendering sprites */
		for(Sprite s : sprites) {
			g2d.drawImage(s.getImage(), s.getX(), s.getY(), game);

			/* Rendering debug rectangle for sprite */
			if(s.debug) {
				Color debugColor = (s.onCollision()) ? Color.red : Color.green;
				g2d.setColor(debugColor);
				g2d.draw(s.getBounds());
			}
		}

	}

}