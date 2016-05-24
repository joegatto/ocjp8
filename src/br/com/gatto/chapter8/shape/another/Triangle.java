package br.com.gatto.chapter8.shape.another;

import br.com.gatto.chapter8.shape.*;

class Triangle extends Shape {
	public void printSide() {
		System.out.println("Side=" + side); // ok

		// compile error
		// System.out.println("Side=" + ((Shape) this).side);

		// Shape myself = ((Shape) this);
		// compile error
		// System.out.println("Side=" + myself.side);
	}

	public void printPerimeter() {
		// compile error
		// System.out.println("Perimeter=" + getPerimeter());
	}
}
