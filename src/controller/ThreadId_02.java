package controller;

public class ThreadId_02 extends Thread {

	private int idThread;
	
	public ThreadId_02(int idThread) {
		this.idThread = idThread;
	}
	
	public void run() {
		System.out.println(idThread);
	}
	
	
}
