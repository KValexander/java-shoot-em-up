/* Package */
package com.main.screen;

/* Import main */
import com.main.Config;
import com.main.Game;

/* Import engine */
import com.main.engine.Render;
import com.main.engine.Collision;

/* Import entity sprite */
import com.main.entity.sprite.Player;
import com.main.entity.sprite.Enemy;

/* Import util */
import java.util.Set;
import java.util.HashSet;

/* Import awt event */
import java.awt.event.KeyEvent;

/* Class Level extends Screen */
public class Level extends Screen {

	private Player player; // player
	private Set<Enemy> enemies; // enemies

	/* Constructor */
	public Level(Game game, Render render, Collision collision) {
		super(game, render, collision);
	}

	/* Action when switching to this screen */
	@Override
	public void doEnterScreen() {
		System.out.println("Level: enter screen");

		/* Player */
		player = new Player(); // create player
		player.setPos(Config.SCREEN[0] / 2 - player.getWidth() / 2, Config.SCREEN[0] / 2 - player.getHeight() / 2); // set position for player
		render.add(player); // rendering player
		collision.add(player); // collision player

		/* Enemies */
		enemies = new HashSet<>();
		for(int i = 0; i < 3; i++) {
			Enemy enemy = new Enemy(); // create enemy
			enemy.setPos(Config.SCREEN[0] / 3 * i + 64, 20);
			enemies.add(enemy); // add enemy to list
			render.add(enemy); // rendering enemy
			collision.add(enemy); // collision enemy
		}

	}

	/* Action when switching to another screen */
	@Override
	public void doExitScreen() {
		System.out.println("Level: exit screen");

		/* Player */
		render.remove(player); // remove player from rendering
		collision.remove(player); // remove player from collision

		/* Enemies */
		for(Enemy e : enemies) {
			render.remove(e);
			collision.remove(e);
		}

	}

	/* Update data on screen */
	@Override
	public void update() {

		/* Player move */
		player.move(game.pKeys);

	}

}