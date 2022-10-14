/* Package */
package com.main.screen.sprite;

/* Import Config */
import com.main.Config;

/* Import awt image */
import javax.swing.ImageIcon;

/* Class Player extends Sprite */
public class Player extends Sprite {

	/* Constructor */
	public Player() {
		ImageIcon ii = new ImageIcon("assets/player.png");
		int width = ii.getImage().getWidth(null);
		setImage(ii.getImage());
		x = Config.SCREEN[0] / 2 - width / 2;
		y = 164;
	}

}