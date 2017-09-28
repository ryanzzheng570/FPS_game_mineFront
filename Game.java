package mineFront;

import mineFront.graphics.Render;

public class Game implements Runnable{
	private final static int WIDTH = 800;
	private final static int HEIGHT = 400;
	private static Thread thread;
	private static boolean running = false;
	private Render render;
	
	public Game(){
		render = new Render(WIDTH, HEIGHT);
	}
	private static void start() {
		if (running)
			return;
		running = true;
		thread = new Thread();
		thread.start();
	}
	
	public void run() {
		while(running){
			tick();
			render();
			
		}
	}
	
	private void render() {
		// TODO Auto-generated method stub
		
	}

	private void tick() {
		// TODO Auto-generated method stub
		
	}

	private void stop(){
		if(!running)
			return;
		running = false;
		try{
			thread.join();
		}catch(Exception e){
			e.printStackTrace();
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		start();
		GameDisplay window = new GameDisplay(WIDTH, HEIGHT);
	}

	

}
