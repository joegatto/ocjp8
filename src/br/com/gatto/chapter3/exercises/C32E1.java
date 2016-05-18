package br.com.gatto.chapter3.exercises;

import java.util.*;
import java.io.*;

/**
 * 1. A resposta certa é (a). O arquivo não compila pois não podemos ter um
 * import após a definição de uma classe.
 */

class D {
	public static void main(String[] args) {
		ArrayList<String> existing = new ArrayList<String>();

		for (String arg : args) {
			if (new E().exists(arg)) {
				existing.add(arg);
			}
		}
	}
}

// import java.io.*; ERRO DE COMPILAÇÃO pois o import deve ser declarado logo
// apos o package e antes da classe.

class E {
	public boolean exists(String name) {
		File f = new File(name);
		return f.exists();
	}
}