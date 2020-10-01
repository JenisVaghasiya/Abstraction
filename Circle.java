package com.ck.abstraction;

public class Circle extends Shape {

	void draw() {
		System.out.println(" draw ... Circle");		
	}
	void display() {
		
		System.out.println(" display... Circle ");		
	}
void changeLength() {
	length=10;
	System.out.println(" display... Circle - length => "+length);		

}
	public static void main(String[] args) {
		Shape c = new Circle();
		c.draw();
		c.display();
		
		Shape rectangle = new Rectangle();
		rectangle.draw();
		rectangle.display();
	}
}
