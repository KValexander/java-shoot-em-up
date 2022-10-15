/* Package */
package com.main;

/* Import main */
import com.main.Config;
import com.main.Game;

/* Import sprite */
import com.main.sprite.Sprite;

/* Import utils */
import java.util.Set;
import java.util.HashSet;

/* Import awt */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/* Class Render */
public class Render {

	private Game game; // game panel
	private Set<Sprite> sprites; // list sprites
	
	/* Constructor */
	public Render(Game game) {
		this.game = game;
		sprites = new HashSet<>();
	}

	/* Add sprite */
	public void addSprite(Sprite sprite) {
		sprites.add(sprite);
	}

	/* Remove sprite */
	public void removeSprite(Sprite sprite) {
		sprites.remove(sprite);
	}

	/* Clear sprites */
	public void clearSprites() {
		sprites.clear();
	}

	/* Rendering game objects */
	public void render(Graphics g) {

		/* Rendering background */
		g.setColor(new Color(0x4cb5f5));
		g.fillRect(0, 0, Config.SCREEN[0], Config.SCREEN[1]);

		/* Rendering sprites */
		for(Sprite s : sprites) {
			g.drawImage(s.getImage(), s.getX(), s.getY(), game);
		}


	}

}