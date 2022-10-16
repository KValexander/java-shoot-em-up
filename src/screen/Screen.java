/* Package */
package com.main.screen;

/* Import main */
import com.main.Game;

/* Import engine */
import com.main.engine.Render;
import com.main.engine.Collision;

/* Import awt event */
import java.awt.event.KeyEvent;

/* Class Screen */
public abstract class Screen {

	protected Game game; // game panel
	protected Render render; // render
	protected Collision collision; // collision

	/* Constructor */
	public Screen(Game game) {
		this.game = game;
	}

	/* Constructor */
	public Screen(Game game, Render render) {
		this.game = game;
		this.render = render;
	}

	/* Constructor */
	public Screen(Game game, Render render, Collision collision) {
		this.game = game;
		this.render = render;
		this.collision = collision;
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