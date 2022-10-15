/* Package */
package com.main.sprite;

/* Import Config */
import com.main.Config;

/* Import awt image */
import javax.swing.ImageIcon;

/* Class Player extends Sprite */
public class Player extends Sprite {

	/* Constructor */
	public Player() {

		/* Set player image */
		setImage(new ImageIcon("assets/player.png").getImage());

		/* Set start position */
		setPos("center");

	}

}