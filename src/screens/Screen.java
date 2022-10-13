/* Package */
package com.main.screen;

/* Import main */
import com.main.Config;
import com.main.Game;

/* Import awt */
import java.awt.Graphics;

/* Class Screen */
public abstract class Screen {

	public Game game; // game panel

	/* Constructor */
	public Screen(Game game) {
		this.game = game;
	}

	/* Actions when changing the screen */
	public abstract void change();

	/* Update data on screen */
	public abstract void update();

	/* Draw on screen */
	public abstract void draw(Graphics g);

	/* Change screen */
	private void changeScreen(int index) {
	
		game.currentScreen = game.screens.get(index);
		game.currentScreen.change();
	
	}

}