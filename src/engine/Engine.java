/* Package */
package com.main.engine;

/* Import main */
import com.main.Game;

/* Import entity */
import com.main.entity.Entity;

/* Import entity sprite */
import com.main.entity.sprite.Sprite;

/* Import util */
import java.util.Set;
import java.util.HashSet;

/* Class Engine */
public class Engine {

	protected Game game; // game panel
	protected Set<Entity> entities; // list entities
	protected Set<Sprite> sprites; // list sprites

	/* Constructor */
	public Engine(Game game) {
		this.game = game;
		entities = new HashSet<>();
		sprites = new HashSet<>();
	}

	/* Add entity */
	public void add(Entity entity) {
		entities.add(entity);
	}

	/* Add sprite */
	public void add(Sprite sprite) {
		sprites.add(sprite);
	}

	/* Remove entity */
	public void remove(Entity entity) {
		entities.remove(entity);
	}

	/* Remove sprite */
	public void remove(Sprite sprite) {
		/* sprite instanceof Sprite */
		sprites.remove(sprite);
	}

	/* Clear entities */
	public void clear() {
		entities.clear();
		sprites.clear();
	}

}