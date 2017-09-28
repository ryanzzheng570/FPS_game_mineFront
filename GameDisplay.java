package mineFront;

import java.awt.Canvas;
import javax.swing.JFrame;

public class GameDisplay extends JFrame{
	private final int WIDTH;
	private final int HEIGHT;
	private final String TITLE = "MineFront Test";
	
	private Canvas gameDisplay;
	private JFrame gameFrame;
	
	public GameDisplay(int width, int height){
		this.WIDTH = width;
		this.HEIGHT = height;
		
		gameDisplay = new Canvas();
		gameFrame = new JFrame(TITLE);
		
		gameFrame.add(gameDisplay);
		gameFrame.pack();
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setLocationRelativeTo(null);
		gameFrame.setSize(WIDTH, HEIGHT);
		gameFrame.setResizable(false);
		gameFrame.setVisible(true);		
	}
	
	public Canvas getGameDisplay() {
		return gameDisplay;
	}

	public void setGameDisplay(Canvas gameDisplay) {
		this.gameDisplay = gameDisplay;
	}

	public JFrame getGameFrame() {
		return gameFrame;
	}

	public void setGameFrame(JFrame gameFrame) {
		this.gameFrame = gameFrame;
	}
}
