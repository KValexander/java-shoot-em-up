/* Package */
package com.main.screen;

/* Import sprites */
import com.main.screen.sprite.*;

/* Import main */
import com.main.Game;

/* Import awt */
import java.awt.Color;
import java.awt.Graphics;

/* Import awt event */
import java.awt.event.KeyEvent;

/* Class Menu extends Screen */
public class Menu extends Screen {

	private Player player; // player

	/* Constructor */
	public Menu(Game game) {
		super(game);

		/* Player */
		player = new Player();
	}

	/* Action when switching to this screen */
	@Override
	protected void doEnterScreen() {
		System.out.println("Menu: enter screen");
	}

	/* Action when switching to another screen */
	@Override
	protected void doExitScreen() {
		System.out.println("Menu: exit screen");
	}

	/* Update data on screen */
	@Override
	public void update() {

	}

	/* Draw on screen */
	@Override
	public void draw(Graphics g) {

		/* Draw player */
		g.drawImage(player.getImage(), player.getX(), player.getY(), game);
	}

}