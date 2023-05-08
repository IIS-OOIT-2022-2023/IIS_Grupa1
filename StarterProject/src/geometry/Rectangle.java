package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape{

	private Point upperLeftPoint;
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(Point upperLeftPoint, int width, int height) {
		this.upperLeftPoint = upperLeftPoint;
		this.width = width; 
		this.height = height;
	}
	
	public Rectangle(Point upperLeftPoint, int width, int height, boolean selected) {
		this(upperLeftPoint, width, height); 
		this.selected = selected;
	}
	
	//Povrsina pravougaonika P=w*h
	public int area() {
		return width * height;
	}
	
	//Obim pravougaonika 
	public int circumference() {
		return 2*(width + height);
	}
		
	public boolean contains(int x, int y) {
		return (x >= upperLeftPoint.getX() && x <= upperLeftPoint.getX() + width 
				&& y >= upperLeftPoint.getY() && y <= upperLeftPoint.getY() + height);
	}
	
	public String toString() {
		return "Upper left point: " + upperLeftPoint + ", width = " + width + ", height = " + height;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle pomocna = (Rectangle) obj;
			if (this.upperLeftPoint.equals(pomocna.upperLeftPoint) && this.width == pomocna.width
					&& this.height == pomocna.height)
				return true;
			else 
				return false;
		} else 
			return false;
			
	}
	
	//Metode pristupa
	public Point getUpperLeftPoint() {
		return this.upperLeftPoint;
	}
	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(upperLeftPoint.getX(), upperLeftPoint.getY(), 
				width, height);
		if(selected) {
			g.setColor(Color.BLUE);
			g.drawRect(upperLeftPoint.getX() - 2, upperLeftPoint.getY() - 2,4,4);
			g.drawRect(upperLeftPoint.getX() + width - 2, upperLeftPoint.getY() - 2,4,4);
			g.drawRect(upperLeftPoint.getX() - 2, upperLeftPoint.getY() + height - 2,4,4);
			g.drawRect(upperLeftPoint.getX() + width - 2, upperLeftPoint.getY() + height - 2,4,4);
		}
		
	}

	@Override
	public void moveTo(int x, int y) {
		this.upperLeftPoint.moveTo(x,y);
		
	}

	@Override
	public void moveBy(int byX, int byY) {
		this.upperLeftPoint.moveBy(byX,byY);
		
	}
	
	public int compareTo(Object o) {
		if (o instanceof Rectangle)
			return (int) (this.area() - ((Rectangle) o).area());
		return 0;
	}

}
