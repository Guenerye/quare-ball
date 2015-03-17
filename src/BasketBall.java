import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class BasketBall {

	private int width = 300;
	private int height = 300;
	private int y = height/2;
	private int x = width/2;
	private int v=0;
	private int r=10;
	
	public static void main(String[] args) {
		
		final BasketBall b = new BasketBall();
		final BasketBall b1= new BasketBall ();
		
		JPanel panel = new JPanel() {
			
			@Override
			public void paintComponent(Graphics g) {
				g.setColor(Color.GREEN);
				g.drawRect(b.x-b.r, b.y-b.r, 4*b.r, 4*b.r);
			
				
	
			}
		
		
		
		};
		
	
		
		JFrame frame = new JFrame();
		frame.setContentPane(panel);
		frame.setContentPane(panel);
		panel.setSize(b.width, b.height);
	
		
		frame.setSize(250, 250);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		while (true) {
			b.simulate();
			panel.repaint();
			System.out.println("neuer Ball");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void simulate() {
		
		x = x + v;
		v = v - 1;
		if (x <=-r) {
			v = - v;
		}
		
		
	}
	
	
}






