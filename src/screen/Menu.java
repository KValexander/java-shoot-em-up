/* Package */
package com.main.screen;

/* Import main */
import com.main.Game;

/* Import engine */
import com.main.engine.Render;
import com.main.engine.Collision;

/* Import awt event */
import java.awt.event.KeyEvent;

/* Import swing */
import javax.swing.JButton;

/* Class Menu extends Screen */
public class Menu extends Screen {

	private JButton btn; // test button

	/* Constructor */
	public Menu(Game game) {
		super(game);
	}

	/* Action when switching to this screen */
	@Override
	public void doEnterScreen() {
		System.out.println("Menu: enter screen");
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