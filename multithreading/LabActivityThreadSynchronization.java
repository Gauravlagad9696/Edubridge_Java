package com.multithreading;

class SynchronizedEx1 {
	synchronized void show(String p) {
		try {
			System.out.println("*****");
			System.out.print(p);
			Thread.sleep(2000);
			System.out.println("#####");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MyThread implements Runnable {
	Thread c;
	String m;
	SynchronizedEx1 r;

	MyThread(SynchronizedEx1 w, String k) {
		r = w;
		m = k;
		c = new Thread(this);
	}

	public void run() {
		r.show(m);
	}
}

public class LabActivityThreadSynchronization {
	public static void main(String s[]) throws InterruptedException {
		SynchronizedEx1 d = new SynchronizedEx1();
		MyThread t1 = new MyThread(d, "Hello");
		MyThread t2 = new MyThread(d, "JAVA");
		MyThread t3 = new MyThread(d, "JavaScript !");

		t1.c.start();
		t2.c.start();
		t1.c.join();
		t2.c.join();
		t3.c.start();
		
	}

}
