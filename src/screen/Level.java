/* Package */
package com.main.screen;

/* Import main */
import com.main.Config;
import com.main.Game;

/* Import engine */
import com.main.engine.Render;
import com.main.engine.Collision;

/* Import sprite */
import com.main.sprite.Player;
import com.main.sprite.Enemy;

/* Import utils */
import java.util.Set;
import java.util.HashSet;

/* Import awt */
import java.awt.Color;
import java.awt.Graphics;

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
		player.setPos("center"); // set position for player
		render.addSprite(player); // rendering player
		collision.addSprite(player); // collision player

		/* Enemies */
		enemies = new HashSet<>();
		for(int i = 0; i < 3; i++) {
			Enemy enemy = new Enemy(); // create enemy
			enemy.setPos(Config.SCREEN[0] / 3 * i + enemy.getWidth() / 2, 20);
			enemies.add(enemy); // add enemy to list
			render.addSprite(enemy); // rendering enemy
			collision.addSprite(enemy); // collision enemy
		}

	}

	/* Action when switching to another screen */
	@Override
	public void doExitScreen() {
		System.out.println("Level: exit screen");

		/* Player */
		render.removeSprite(player); // remove player from rendering

		/* Enemies */
		for(Enemy e : enemies) {
			render.removeSprite(e);
			collision.removeSprite(e);
		}

	}

	/* Update data on screen */
	@Override
	public void update() {

		/* Player move */
		player.move(game.pKeys);

	}

}