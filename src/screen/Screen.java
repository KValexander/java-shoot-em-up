/* Package */
package com.main.screen;

/* Import main */
import com.main.Game;
import com.main.Render;

/* Import awt */
import java.awt.Graphics;

/* Import awt event */
import java.awt.event.KeyEvent;

/* Class Screen */
public abstract class Screen {

	protected Game game; // game panel
	protected Render render; // render

	/* Constructor */
	public Screen(Game game, Render render) {
		this.game = game;
		this.render = render;
	}

	/* Action when switching to this screen */
	public abstract void doEnterScreen();

	/* Action when switching to another screen */
	public abstract void doExitScreen();

	/* Key pressed */
	public void keyPressed(KeyEvent e) {}

	/* Key released */
	public void keyReleased(KeyEvent e) {}

	/* Update data on screen */
	public abstract void update();

	/* Change screen */
	public void changeScreen(int index) {
	
		game.currentScreen.doExitScreen();
		game.currentScreen = game.screens.get(index);
		game.currentScreen.doEnterScreen();
	
	}

}