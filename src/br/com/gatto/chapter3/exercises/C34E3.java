package br.com.gatto.chapter3.exercises;

import java.util.Date;
import java.sql.*;

/**
 * 3. A resposta certa � (c). N�o existe ambiguidade uma vez que o import
 * espec�fico tem prefer�ncia em cima do * .
 */

class C34E3 {
	public static void main(String[] args) {
		System.out.println("Today: " + new Date().toString());
	}
}
