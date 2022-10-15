/* Package */
package com.main.engine;

/* Import main */
import com.main.Game;

/* Import sprite */
import com.main.sprite.Sprite;

/* Import utils */
import java.util.Set;
import java.util.HashSet;

/* Class Engine */
public class Engine {

	protected Game game; // game panel
	protected Set<Sprite> sprites; // list sprites

	/* Constructor */
	public Engine(Game game) {
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

}