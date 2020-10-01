package com.ck.abstraction;

public abstract class Shape {
	int length=5;
	Shape() {
		System.out.println(" shape created...");
	}
	//abstract void changeLength();
	abstract void draw();
	void display() {
		System.out.print(" display shape ... length "+length);
	}
}
