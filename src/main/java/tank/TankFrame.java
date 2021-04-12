package tank;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
	int x = 200;
	int y = 200;
	public TankFrame() {
		setSize(800, 600);
		setResizable(false);
		setTitle("title war");
		setVisible(true);
		addKeyListener(new MyKeyListener());
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});	
	}
	@Override
	public void paint(Graphics g) {
		System.out.println("shabi");
		g.fillRect(x, y, 50, 50);
		x = x+10;
		y = y+10;
	}
	class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
//			System.out.println("keyPress");
//			x = x+10;
//			y = y+10;
			
		}
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("keyReleased");
		}
	}
}
