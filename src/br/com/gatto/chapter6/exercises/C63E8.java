package br.com.gatto.chapter6.exercises;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 8. A resposta certa é (b). O código compila e imprime somente a. Isso porque
 * ele executa um next durante o passo de iteração do laço for, o que acaba
 * consumindo o segundo elemento sem imprimi-lo.
 */
public class C63E8 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add(0, "b");
		a.add(0, "a");
		for (Iterator<String> i = a.iterator(); i.hasNext(); i.next()) {
			String element = i.next();
			System.out.println(element);
		}
	}
}
