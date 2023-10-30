package com.pattern.program;

interface Shape1 {
	void draw();
}

class Rectangle1 implements Shape1 {
	@Override
	public void draw() {
		System.out.println("Shape Rectangle !");

	}
}

class Circle implements Shape1 {

	@Override
	public void draw() {
		System.out.println(" Shape Circle !");
	}
}

abstract class ShapeDecorator implements Shape1 {
	protected Shape1 decoratedShape;

	public ShapeDecorator(Shape1 decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
}

class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape1 decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape1 decoratedShape) {
		System.out.println("Border Color : Red ");
	}

}

public class DecoratedPatternExample {

	public static void main(String[] args) {
		Shape1 circle = new Circle();
		Shape1 redCircle = new RedShapeDecorator(new Circle());

		Shape1 redRectangle = new RedShapeDecorator(new Rectangle1());
		System.out.println("circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();
	}

}
