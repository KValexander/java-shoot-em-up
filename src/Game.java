/* Package */
package com.main;

/* Import engine */
import com.main.engine.Render;
import com.main.engine.Collision;

/* Import screens */
import com.main.screen.*;

/* Import utils */
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

/* Import awt */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

/* Import awt event */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/* Import swing */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.AbstractAction;

/*	Sections:
		- Varibles
		- Constructor
		- Init (Window, Render, Game, Screens)
		- Init KeyListener
		- Update
		- GameLoop (start Timer and tick)
		- Draw
*/

/* Class Game extends JPanel */
public class Game extends JPanel {

	private boolean isStart; // start game

	private JFrame window; // window
	private Timer timer; // Timer for game loop

	/* Engine */
	public Render render; // rendering game objects
	public Collision collision; // collision game objects

	public List<Screen> screens; // screen list
	public Screen currentScreen; // curren screen

	/* Pressed keys */
	public Set<Integer> pKeys = new HashSet<>();


	/* Constructor */
	public Game() {

		isStart = false; // start false

		initWindow(); // init window
		initEngine(); // init render
		initGame(); // init game
		
		isStart = true; // start true

	}

	/* Init window */
	private void initWindow() {

		/* Window */
		window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(Config.SCREEN[0], Config.SCREEN[1]);
		window.setTitle("Mercenaries of fortune");
		window.setResizable(false);

		/* Add game panel to frame */
		window.add(this);

		/* Visible window */
		window.setLocationRelativeTo(null);
		window.setVisible(true);

		/* Game panel */
		setPreferredSize(new Dimension(Config.SCREEN[0], Config.SCREEN[1]));
		setBackground(new Color(0x4cb5f5));
		setDoubleBuffered(true);
		setFocusable(true);

	}

	/* Init engine */
	private void initEngine() {

		render = new Render(this); // render
		collision = new Collision(this); // collision

	}

	/* Init Game */
	private void initGame() {

		initScreens(); // init screens
		initKeyListener(); // init key listener

		startTimer(); // start game loop

	}

	/* Init Screens */
	private void initScreens() {

		/* Screen list */
		screens = new ArrayList<>();

		/* Screens */
		Screen scMenu 	= new Menu	(this, render, collision);
		Screen scSelect = new Select(this, render, collision);
		Screen scLevel 	= new Level	(this, render, collision);

		/* Add screens to list */
		screens.add(scMenu);
		screens.add(scSelect);
		screens.add(scLevel);

		/* Current screen */
		currentScreen = scMenu;
		currentScreen.doEnterScreen();

	}

	/* Init key listener */
	private void initKeyListener() {

		/* Add key listener */
		addKeyListener(new KeyAdapter() {

			/* Key pressed */
			@Override
			public void keyPressed(KeyEvent e) {
				pKeys.add(e.getKeyCode()); // add pressed key

				/* Key pressed on the screen */
				currentScreen.keyPressed(e);
			}

			/* Key released */
			@Override
			public void keyReleased(KeyEvent e) {
				pKeys.remove(e.getKeyCode()); // remove pressed key

				/* Key released on the screen */
				currentScreen.keyReleased(e);
			}

		});

	}

	/* Update game data */
	private void update() {

		/* Update current screen */
		currentScreen.update();

		/* Collision game objects */
		collision.collision();

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
	
	}

	/* Paint component */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // parent
		Graphics2D g2d = (Graphics2D)g;

		/* Rendering game objects */
		render.render(g2d);

		g2d.dispose(); // dispose
	}

	// /* Render game elements */
	// private void draw(Graphics g) {

	// 	/* Background */
	// 	g.setColor(new Color(0x4cb5f5));
	// 	g.fillRect(0, 0, Config.SCREEN[0], Config.SCREEN[1]);

	// 	/* Draw current screen */
	// 	currentScreen.draw(g);

	// }

}