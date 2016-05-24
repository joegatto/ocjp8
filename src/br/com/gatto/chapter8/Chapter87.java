package br.com.gatto.chapter8;

public class Chapter87 {
	private String name;
	private String lastname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name.trim().length() >= 3)
			this.name = name;
		else {
			throw new IllegalArgumentException("At least 3 chars");
		}
	}
}
