/* Package */
package com.main.screen;

/* Import main */
import com.main.Game;

/* Import awt */
import java.awt.Color;
import java.awt.Graphics;

/* Import awt event */
import java.awt.event.KeyEvent;

/* Class Level extends Screen */
public class Level extends Screen {

	/* Constructor */
	public Level(Game game) {
		super(game);
	}

	/* Action when switching to this screen */
	@Override
	protected void doEnterScreen() {
		System.out.println("Level: enter screen");
	}

	/* Action when switching to another screen */
	@Override
	protected void doExitScreen() {
		System.out.println("Level: exit screen");
	}

	/* Update data on screen */
	@Override
	public void update() {

	}

	/* Draw on screen */
	@Override
	public void draw(Graphics g) {
		
	}

}