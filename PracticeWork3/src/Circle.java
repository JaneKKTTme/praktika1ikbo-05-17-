import java.lang.*;

public class Circle extends Shape {
	protected double radius;
	public static final double PI = 3.14;
	
	public Circle() {};
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		this.color = color;
		this.filled = filled;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return PI*this.radius*this.radius;
	}
	@Override
	public double getPerimeter() {
		return 2*PI*this.radius;
	}
	@Override
	public String toString() {
		return "Shape: Circle; Radius: "+this.radius+" sm; Filled: "+this.filled+"; Color: "+this.color+".";
	}
}
