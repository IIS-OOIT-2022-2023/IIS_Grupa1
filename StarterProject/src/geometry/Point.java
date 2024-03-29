package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Point extends Shape{

	private int x;
	private int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x, int y, boolean selected) {
		this(x, y);
		this.selected = selected;
	}
	
	public double distance(int x2, int y2) {
		int dx = x2 - x;
		int dy = y2 - y;
		double d = Math.sqrt(dx*dx + dy*dy);
		return d;
	}
	
	public boolean contains(int x, int y) {
		return this.distance(x,y) <= 2;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point pomocna = (Point)obj;
			if (pomocna.x == this.x && pomocna.y == this.y) {
				return true;
			} else 
				return false;
			
		} else 
			return false;
	}
	
	//Metode pristupa
	public int getX() {
		return x;
	}
	
	public void setX(int novoX) {
		x = novoX;
	}
	
	public int  getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y; 
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawLine(x-2, y, x+2, y);  //horizontalna linija
		g.drawLine(x,y-2, x, y+2); //vertikalna linija
		if (selected) {
			g.setColor(Color.BLUE);
			g.drawRect(x-2,y-2,4,4);
		}
	}

	@Override
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void moveBy(int byX, int byY) {
		this.x += byX;
		this.y += byY;
		
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Point)
			return (int) (this.distance(0,0) - ((Point) o).distance(0,0));
		return 0;
	}
}
