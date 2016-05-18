package br.com.gatto.chapter3.exercises;

import java.util.Date;
import java.sql.*;

/**
 * 3. A resposta certa é (c). Não existe ambiguidade uma vez que o import
 * específico tem preferência em cima do * .
 */

class C34E3 {
	public static void main(String[] args) {
		System.out.println("Today: " + new Date().toString());
	}
}
