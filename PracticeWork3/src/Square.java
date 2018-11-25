public class Square extends Rectangle {
	protected double side;
	public Square() {};
	public Square(double side) {
		this.width = side;
	}
	public Square(double side, String color, boolean filled) {
		this.width = side;
		this.color = color;
		this.filled = filled;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.width = side;
	}
	@Override
	public double getArea() {
		return this.width*this.width;
	}
	@Override
	public double getPerimeter() {
		return 4*this.width;
	}
	@Override
	public String toString() {
		return "Shape: Square; Side: "+this.width+" sm; Filled: "+this.filled+"; Color: "+this.color+".";
	}
}