package controller;

import java.util.Random;

public class Exerc_03 extends Thread {
	private int n;
	private int i;
	private int res;
	private Random r = new Random();

	public Exerc_03(int i) {
		this.i = i;
	}

	public void run() {
		sum();
	}

	private void sum() {
		try {
			Thread.sleep(i*500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int j = 0; j < 5; j++) {
			n = r.nextInt(1000);
			res += n;
			if(j==4) {
				System.out.print(" " + n);
			}else {
				System.out.print(" " + n + " +");
			}
		}
		System.out.println();
		System.out.println("Thread - " + i + " soma = " + res);
		System.out.println("================================");
	}
}