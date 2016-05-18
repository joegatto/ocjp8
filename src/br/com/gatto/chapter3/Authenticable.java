package br.com.gatto.chapter3;

public interface Authenticable {
	final int PASSWORD_LENGTH = 8;
	
	void authenticate (String login, String password); 
}
