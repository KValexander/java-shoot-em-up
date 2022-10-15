/* Package */
package com.main.sprite;

/* Import Config */
import com.main.Config;

/* Import awt */
import java.awt.Rectangle;

/* Import for load image */
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/* Class Sprite */
public class Sprite {

	private BufferedImage image; // image
	private boolean collision = false; // collision state

	public boolean debug = true; // debug

	/* Position */
	int x = 0;
	int y = 0;

	/* Size */
	int width = 0;
	int height = 0;

	/* Acceleration */
	float dx = 0;
	float dy = 0;

	/* Set image */
	public void setImage(String src) {

		/* Load image */
		try {
			image = ImageIO.read(new File(src));
		}
		
		/* Error load image */
		catch (IOException e) {
			System.out.println("Exception occured: " + e.getMessage());
		}
		
		/* Get size from image */
		width = image.getWidth(null);
		height = image.getHeight(null);

	}

	/* Get image */
	public BufferedImage getImage() {
		return image;
	}

	/* Get sprite bounds */
	public Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}

	/* Set Position (x, y) */
	public void setPos(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/* Set position (string) */
	public void setPos(String namePosition) {

		/* Width centering */
		x = Config.SCREEN[0] / 2 - width / 2;

		/* Prepared positions */
		switch (namePosition) {

			/* Top position */
			case "top":
				y = 0;
			break;

			/* Center position */ 
			case "center":
				y = Config.SCREEN[1] / 2 - height / 2; 
			break;

			/* Down position */
			case "down":
				y = Config.SCREEN[1] - height; 
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

	/* Set size */
	public void setSize(int w, int h) {
		width = w;
		height = h;
	}

	/* Get Width */
	public int getWidth() {
		return width;
	}

	/* Get Height */
	public int getHeight() {
		return height;
	}

	/* Set collision */
	public void setCollision(boolean collision) {
		this.collision = collision;
	}

	/* Check collision */
	public boolean onCollision() {
		return collision;
	}

}