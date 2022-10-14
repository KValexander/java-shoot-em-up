/* Package */
package com.main.screen.sprite;

/* Import awt image */
import java.awt.Image;

/* Class Sprite */
public class Sprite {

	Image image; // image

	int x, y; // position
	int dx, dy; // acceleration

	/* Set image */
	public void setImage(Image image) {
		this.image = image;
	}

	/* Get image */
	public Image getImage() {
		return image;
	}

	/* Set X */
	public void setX(int x) {
		this.x = x;
	}

	/* Set Y */
	public void setY(int y) {
		this.y = y;
	}

	/* Get X */
	public int getX() {
		return x;
	}

	/* Get Y */
	public int getY() {
		return y;
	}

}