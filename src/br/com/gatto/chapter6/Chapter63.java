package br.com.gatto.chapter6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Chapter63 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("certification");
		names.add(0, "java");

		System.out.println(names.get(0));

		System.out.println(names.contains("java"));
		System.out.println(names.contains("c#"));

		System.out.println(names.size());

		ArrayList<String> countries = new ArrayList<String>();
		countries.add("korea");
		countries.set(0, "brazil");

		ArrayList<String> everything = new ArrayList<String>();
		everything.addAll(names);
		everything.addAll(countries);
		System.out.println(everything.size());

		Object[] objectArray = names.toArray();

		String[] names3 = names.toArray(new String[0]);
		String[] names4 = names.toArray(new String[names.size()]);

		boolean removed = names.remove("java");

		String nameRemoved = names.remove(0);

		System.out.println(names.contains("java"));
		System.out.println(names.contains("c#"));

		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("guilherme");
		names2.add("mario");
		names2.add("paulo");
		names2.add("mauricio");
		names2.add("adriano");
		names2.add("alberto");
		names2.add("mario");

		System.out.println(names2.indexOf("guilherme"));
		System.out.println(names2.indexOf("mario"));
		System.out.println(names2.indexOf("john"));
		System.out.println(names2.lastIndexOf("mario"));
		System.out.println(names2.lastIndexOf("john"));

		Collection<String> strings = new ArrayList<String>();
		Iterator<String> iterator = strings.iterator();
		while (iterator.hasNext()) {
			String current = iterator.next();
			System.out.println(current);
		}

		for (String current : strings) {
			System.out.println(current);
		}

		Cliente guilherme = new Cliente();
		guilherme.setName("guilherme");

		ArrayList<Cliente> clients = new ArrayList<Cliente>();
		clients.add(guilherme);

		System.out.println(guilherme.getName()); // guilherme
		System.out.println(clients.get(0).getName()); // guilherme

		guilherme.setName("Silveira");

		System.out.println(guilherme.getName()); // guilherme
		System.out.println(clients.get(0).getName()); // guilherme
	}
}

class Cliente {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
