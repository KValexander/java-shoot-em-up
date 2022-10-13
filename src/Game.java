/* Package */
package com.main;

/* Import screens */
import com.main.screen.*;

/* Import utils */
import java.util.List;
import java.util.ArrayList;

/* Import awt */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

/* Import awt event */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* Import swing */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.AbstractAction;

/*	Sections:
		- Varibles
		- Constructor
		- Init
		- Setup
		- Update
		- GameLoop (start Timer and tick)
		- Draw
*/

/* Class Game extends JPanel */
public class Game extends JPanel {

	private JFrame window; // window
	private Timer timer; // Timer for game loop

	public List<Screen> screens; // screen list
	public Screen currentScreen; // curren screen

	/* Constructor */
	public Game() {

		initWindow(); // init window
		setupGame(); // setup game

		startTimer(); // start game loop

	}

	/* Init window */
	private void initWindow() {

		/* Window */
		window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(Config.SCREEN[0], Config.SCREEN[1]);
		window.setTitle("Mercenaries of fortune");
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);

		/* Add game panel to frame */
		window.add(this);

		/* Game panel */
		setPreferredSize(new Dimension(Config.SCREEN[0], Config.SCREEN[1]));
		setBackground(new Color(0x4cb5f5));
		setFocusable(true);

	}

	/* Setup Game */
	private void setupGame() {

		/* Setup screens */
		setupScreens();

	}

	/* Setup Screens */
	private void setupScreens() {

		/* Screen list */
		screens = new ArrayList<>();

		/* Add screens to list */
		screens.add(new Menu(this));
		screens.add(new Select(this));
		screens.add(new Level(this));

		/* Current screen */
		currentScreen = screens.get(0);

	}

	/* Update game data */
	private void update() {

		/* Update current screen */
		currentScreen.update();

	}

	/* Start Timer */
	/* I don't know how it works, it just works */
	private void startTimer() {
		
		/* Create timer */
		timer = new Timer(Config.DELAY, new AbstractAction() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tick(); // game loop
			}

		});

		/* Start timer */
		timer.start();

	}

	/* Game loop */
	private void tick() {

		update(); // update data
		repaint(); // redraw

		/* FPS and DELAY */
		System.out.println("FPS: " + Config.FPS + ", DELAY: " + Config.DELAY);
	
	}


	/* Paint component */
	@Override
	public void paintComponent(Graphics g) {
		draw(g); // render game elements
	}

	/* Render game elements */
	private void draw(Graphics g) {
		
		/* Background */
        g.setColor(new Color(0x4cb5f5));
        g.fillRect(0, 0, Config.SCREEN[0], Config.SCREEN[1]);

		/* Draw current screen */
		currentScreen.draw(g);

	}

}