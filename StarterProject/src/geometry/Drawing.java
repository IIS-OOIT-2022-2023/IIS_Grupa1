package geometry;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	/**
	 * Create the panel.
	 */
	public Drawing() {

	}
	public static void main(String [] args) {
		JFrame frame = new JFrame("Drawing");
		frame.setSize(800, 600);
		Drawing drawing = new Drawing();
		frame.getContentPane().add(drawing);
		frame.setVisible(true);
	}
	public void paint(Graphics g) {
		Point p1 = new Point(25,50);
		//p1.draw(g);
		
		
		Line l1 = new Line(p1, new Point(70,60));
		//l1.draw(g);
		
		g.setColor(Color.RED);
		Rectangle k1 = new Rectangle(new Point(100,100), 60, 60);
		//k1.draw(g);
		
		g.setColor(Color.GREEN);
		Circle c1 = new Circle(new Point(100,200), 35);
		//c1.draw(g);
		
		Donut d1 = new Donut(new Point(150, 250), 60, 40);
		//d1.draw(g);
		
		g.setColor(Color.BLACK);
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(p1);
		shapes.add(l1);
		shapes.add(k1);
		shapes.add(c1);
		shapes.add(d1);
		
		Iterator<Shape> it = shapes.iterator();
		
		while(it.hasNext()) {
			it.next().moveBy(10,0);
		}
		
		/*
		 * iscrtati četvrti element iz liste shapes,
			iscrtati poslednji element liste (podrazumeva se da se ne zna
	 							koliko elemenata ima u listi)
			izbaciti drugi element liste,
			iscrtati drugi element liste, 
			iscrtati element sa indeksom tri i
			dodati liniju u listu tako da ona bude četvrti element liste.

		 * 
		 */
		shapes.get(3).draw(g);
		shapes.get(shapes.size() - 1).draw(g);
		shapes.remove(1);
		shapes.get(1).draw(g);
		shapes.get(3).draw(g);
		shapes.add(3,l1);
		shapes.get(3).draw(g);
		
		try {
			shapes.get(1);
		}
		catch(Exception e) {
			System.out.println("Dogodila se greška");
		}
		finally {
			System.out.println("Uvek se izvrsava!");
		}
		
		try {
			c1.setRadius(-25);
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Radius kruga c1 je: " + c1.getRadius());
		
		p1.setSelected(true);
		l1.setSelected(true);
		c1.setSelected(true);
		k1.setSelected(true);
		d1.setSelected(true);
		//p1.draw(g);
		
		it = shapes.iterator();
		while(it.hasNext()) {
			it.next().draw(g);
		}
		
		HashMap<String, Shape> hmShapes = new HashMap<String, Shape>();
		hmShapes.put("tacka", p1);
		hmShapes.put("linija", l1);
		System.out.println(hmShapes.get("tacka"));
		
	}

}
