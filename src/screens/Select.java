/* Package */
package com.main.screen;

/* Import main */
import com.main.Config;
import com.main.Game;

/* Import awt */
import java.awt.Color;
import java.awt.Graphics;

/* Class Select extends Screen */
public class Select extends Screen {

	/* Constructor */
	public Select(Game game) {
		super(game);
	}

	/* Actions when changing the screen */
	@Override
	public void change() {

	}

	/* Update data on screen */
	@Override
	public void update() {

	}

	/* Draw on screen */
	@Override
	public void draw(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, Config.SCREEN[0], Config.SCREEN[1]);

	}

}