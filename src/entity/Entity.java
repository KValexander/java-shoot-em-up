/* Package */
package com.main.entity;

/* Import awt */
import java.awt.Rectangle;

/* Import for load image */
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/* Class Entity */
public class Entity {

	/* States */
	private boolean visible = true;
	private boolean isImage = false;

	/* Image */
	protected BufferedImage image;

	/* Position */
	protected int x = 0;
	protected int y = 0;

	/* Size */
	protected int width = 0;
	protected int height = 0;

	/* Check visible */
	public boolean isVisible() {
		return visible;
	}

	/* Set visible */
	public void setVisible(boolean v) {
		visible = v;
	} 

	/* Check image */
	public boolean isImage() {
		return isImage;
	}

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

		/* Is image */
		isImage = true;

	}

	/* Get image */
	public BufferedImage getImage() {
		return image;
	}

	/* Get sprite bounds */
	public Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}

	/* Set position */
	public void setPos(int x, int y) {
		this.x = x;
		this.y = y;
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

	/* Set width */
	public void setWidth(int w) {
		width = w;
	}

	/* Set height */
	public void setHeight(int h) {
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

}