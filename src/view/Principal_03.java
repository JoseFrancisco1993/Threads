package view;

import controller.Exerc_03;

public class Principal_03 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			Thread t = new Exerc_03(i);
			t.start();
		}
		
	}

}