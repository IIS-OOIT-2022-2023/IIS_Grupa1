package geometry;

public class Point {

	private int x;
	private int y;
	private boolean selected;
	
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
	// u slučaju boolean promenljivih GET metodu nazivamo IS<nazivObelezja>...
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean newSelected) {
		selected = newSelected;
	}
	
	
	
	
	
	
	
	
}
