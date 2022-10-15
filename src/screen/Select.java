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

/* Class Select extends Screen */
public class Select extends Screen {

	/* Constructor */
	public Select(Game game, Render render) {
		super(game, render);
	}

	/* Action when switching to this screen */
	@Override
	public void doEnterScreen() {
		System.out.println("Select: enter screen");
	}

	/* Action when switching to another screen */
	@Override
	public void doExitScreen() {
		System.out.println("Select: exit screen");

	}

	/* Update data on screen */
	@Override
	public void update() {

	}

}