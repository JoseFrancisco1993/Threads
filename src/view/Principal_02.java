package view;
import controller.ThreadId_02;

public class Principal_02 {

	public static void main(String[] args) {

		for (int idThread = 0; idThread < 5; idThread++) {
		Thread threadId_02 = new ThreadId_02(idThread);
		threadId_02.start();
		}		
	}
}

