package com.pattern.program;

import java.util.Hashtable;

abstract class Shape implements Cloneable {
	public String id;
	protected String type;

	abstract void draw();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}

}

class Rectangle extends Shape {
	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	void draw() {
		System.out.println("Inside Rectangle draw method()");

	}
}

class Square extends Shape {
	public Square() {
		type = "Square";
	}

	@Override
	void draw() {
		System.out.println("Inside square draw method()");

	}
}

class ShapeCache {
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	public static void loadCache() {
//		Circle circle = new Circle();
	
	
	Square square = new Square();
//	Square.setId("48");
//	shapeMap.put(square.getId),square);
}
}

public class PrototypePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
