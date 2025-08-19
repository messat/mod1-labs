package oo2Game;

public class Ball {
	public int x, y, w, h;
	private int dirX, dirY;
	private static int worldW;
	private static int worldH;
	
	public Ball(int x, int y, int w, int h, int dirX, int dirY) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
	}
	
	public Ball(int x, int y, int w, int h) {
		this(x, y, w, h, 1, 1);
	}
	
	public void move() {
		//move in the direction of x-axis and y-axis
		x += dirX;
		y += dirY;
		
		//if x is outside of the world, negative. Reset and change direction X
		if(x < 0) {
			x = 0;
			dirX = -dirX;
		}
		//if y is outside of the world, negative. Reset and change direction Y
		if(y < 0) {
			y = 0;
			dirY = -dirY;
		}
		//if X is outside of world on the right, invert it.
		if(x >= worldW -w) {
			x = worldW - w;
			dirX = -dirX;
		}
		//if y is outside of world on the right, invert it.
		if(y >= worldH-h) {
			y = worldH -h;
			dirY = -dirY;
		}
		
	}
	
	public static void setWorld(int w, int h) {
		worldW = w;
		worldH = h;
	}
	
	public static int getWorldW() {
		return worldW;
	}
	
	public static int getWorldH() {
		return worldH;
	}
	
	
}
