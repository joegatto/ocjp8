package br.com.gatto.chapter9.exercises;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 2. A reescrita é válida, pois FileNotFoundException é subclasse de
 * IOException.
 */
class C91E2 {
	protected void turnon() throws IOException {

	}
}

class B91E2 extends C91E2 {
	public void turnon() throws FileNotFoundException {

	}
}