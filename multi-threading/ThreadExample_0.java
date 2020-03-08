class MyThread1 extends Thread{
	public void run() {
		System.out.println("MyThread1 Thread id = " + Thread.currentThread().getId());
	}
}

class MyThread2 implements Runnable{
	public void run() {
		System.out.println("MyThread1 Thread id = " + Thread.currentThread().getId());
	}
}


public class ThreadExample_0 {

	public static void main(String[] args) {
		MyThread1 t1= new MyThread1();
		t1.start();
		Thread t2= new Thread(new MyThread2());
		t2.start();

	}
}




