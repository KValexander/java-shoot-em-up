/* Package */
package com.main.screen;

/* Import main */
import com.main.Game;
import com.main.Render;

/* Import awt */
import java.awt.Color;
import java.awt.Graphics;

/* Import awt event */
import java.awt.event.KeyEvent;

/* Class Menu extends Screen */
public class Menu extends Screen {

	/* Constructor */
	public Menu(Game game, Render render) {
		super(game, render);
	}

	/* Action when switching to this screen */
	@Override
	public void doEnterScreen() {
		System.out.println("Menu: enter screen");

		changeScreen(2);
	}

	/* Action when switching to another screen */
	@Override
	public void doExitScreen() {
		System.out.println("Menu: exit screen");
	}

	/* Update data on screen */
	@Override
	public void update() {

	}

}