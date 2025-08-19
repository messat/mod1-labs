package oo2Game;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

import javax.swing.JFrame;

public class Game extends Canvas {
	
	Ball[] balls = { new Ball(5, 7, 50, 40), 
		new Ball(10, 10, 100, 100, 10, 1),
		new Ball(15, 15, 50, 50, 1, 10)
	};
	
	public Game (){
	JFrame frame = new JFrame();
	this.setSize(1000, 1000);
	frame.add(this);
	frame.pack();
	frame.setVisible(true);
	Ball.setWorld(500, 300);
	Timer t = new Timer();
	TimerTask tt = new TimerTask() {
	@Override
	public void run() {
	draw();
	}
	};
	
	t.schedule(tt, 0, 50);
	
	frame.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
		t.cancel();
		tt.cancel();
		}
		});
	}

	

	public void draw() {
		// call the move() method of each balls
		for(Ball eachBall: balls) {
			eachBall.move();
		}
		// Tip: use an enhanced for loop to pick 
		//	  each ball in the balls array.
		this.repaint();
	}

	public void paint(Graphics g) {
		//g.drawRect(0, 0, 300, 300);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Ball.getWorldW(), Ball.getWorldH());
		// draw each ball in balls array
		for(int i = 0; i < balls.length; i++) {
			Ball eachBall = balls[i];
			if(i == 0) {
				g.setColor(Color.WHITE);
				g.fillRect(eachBall.x, eachBall.y, eachBall.w, eachBall.h);
			} else if(i == 1) {
				g.setColor(Color.green);
				g.fillRoundRect(eachBall.x, eachBall.y, eachBall.w, eachBall.h, 5, 100);
			} else {
				g.setColor(Color.CYAN);
				g.fillArc(eachBall.x, eachBall.y, eachBall.w, eachBall.h, 50, 200);
			}
		}
		
	}


}
