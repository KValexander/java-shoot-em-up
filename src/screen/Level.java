/* Package */
package com.main.screen;

/* Import main */
import com.main.Game;
import com.main.Render;

/* Import sprite */
import com.main.sprite.Player;

/* Import awt */
import java.awt.Color;
import java.awt.Graphics;

/* Import awt event */
import java.awt.event.KeyEvent;

/* Class Level extends Screen */
public class Level extends Screen {

	private Player player; // player

	/* Constructor */
	public Level(Game game, Render render) {
		super(game, render);
	}

	/* Action when switching to this screen */
	@Override
	public void doEnterScreen() {
		System.out.println("Level: enter screen");

		player = new Player(); // create player
		render.addSprite(player);
	}

	/* Action when switching to another screen */
	@Override
	public void doExitScreen() {
		System.out.println("Level: exit screen");
	}

	/* Update data on screen */
	@Override
	public void update() {

	}

}