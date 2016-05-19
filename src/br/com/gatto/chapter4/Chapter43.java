package br.com.gatto.chapter4;

class Chapter43 {
	public static void main(String[] args) {
		Carro a = new Carro();
		a.model = "Ferrari";
		a.setModel("Ferrari");
		System.out.println(a.getData());
	}
}

class Carro {
	String model;
	int year;
	
	public Carro() {
		this.year = 2014;
	}
	
	public String getData() {
		return model + " " + year;
	}
	
	public void setModel(String m) {
		this.model = m;
	}
}
