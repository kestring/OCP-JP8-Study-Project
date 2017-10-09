package chapter1.examples;

import chapter1.examples.cat.BigCat;

public class Examples {

	public static void main(String[] args) {
		BigCat cat = new BigCat();
		System.out.println(cat.name);

		System.out.println(cat.hasFur);
		System.out.println(cat.hasPaws);
		System.out.println(cat.id);
	}

}
