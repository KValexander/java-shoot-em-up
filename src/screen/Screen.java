/* Package */
package com.main.screen;

/* Import main */
import com.main.Game;

/* Import awt */
import java.awt.Graphics;

/* Import awt event */
import java.awt.event.KeyEvent;

/* Class Screen */
public abstract class Screen {

	public Game game; // game panel

	/* Constructor */
	public Screen(Game game) {
		this.game = game;
	}

	/* Action when switching to this screen */
	protected abstract void doEnterScreen();

	/* Action when switching to another screen */
	protected abstract void doExitScreen();

	/* Key pressed */
	public void keyPressed(KeyEvent e) {}

	/* Key released */
	public void keyReleased(KeyEvent e) {}

	/* Update data on screen */
	public abstract void update();

	/* Draw on screen */
	public abstract void draw(Graphics g);

	/* Change screen */
	public void changeScreen(int index) {
	
		game.currentScreen.doExitScreen();
		game.currentScreen = game.screens.get(index);
		game.currentScreen.doEnterScreen();
	
	}

}