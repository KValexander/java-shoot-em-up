/* Package */
package com.main.sprite;

/* Import Config */
import com.main.Config;

/* Import awt image */
import java.awt.Image;

/* Class Sprite */
public class Sprite {

	private Image image; // image
	private boolean isImage; // image presence state

	int x, y; // position
	int w, h; // size
	int dx, dy; // acceleration

	/* Set image */
	public void setImage(Image image) {
		this.image = image;
		w = this.image.getWidth(null);
		h = this.image.getHeight(null);
		isImage = true;
	}

	/* Resize image */
	public void resizeImage(int w, int h) {
		this.image = this.image.getScaledInstance(w, h, Image.SCALE_DEFAULT);
		this.w = w;
		this.h = h;
	}

	/* Get image */
	public Image getImage() {
		return image;
	}

	/* Set Position (x, y) */
	public void setPos(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/* Set position (string) */
	public void setPos(String namePosition) {

		/* Width centering */
		x = Config.SCREEN[0] / 2 - w / 2;

		/* Prepared positions */
		switch (namePosition) {

			/* Top position */
			case "top":
				y = 0;
			break;

			/* Center position */ 
			case "center":
				y = Config.SCREEN[1] / 2 - h / 2; 
			break;

			/* Down position */
			case "down":
				y = Config.SCREEN[1] - h; 
			break;

		}
		
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

	/* Get Width */
	public int getWidth() {
		return w;
	}

	/* Get Height */
	public int getHeight() {
		return h;
	}

}