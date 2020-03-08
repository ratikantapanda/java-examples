class Printer{
	synchronized void printDoc(int numCopies, String docName){
		for(int i=1; i <=numCopies; i++){
			System.out.println(">> printing " +docName+ " " +i);
		}
	}
}
class PrinterThread_1 extends Thread{
	Printer p;
	PrinterThread_1(Printer p){
		this.p=p;
	}
	public void run(){
		p.printDoc(10,"rkp");
	}
}
class PrinterThread_2 extends Thread{
	Printer p;
	PrinterThread_2(Printer p){
		this.p=p;
	}
	public void run(){
		synchronized(p){
			p.printDoc(10,"dkp");
		}
	}
}
class ThreadExample_2{
	public static void main(String[] args){
		System.out.println("==Application started====");
		Printer p=new Printer();
		PrinterThread_1 t1=new PrinterThread_1(p);
		t1.start();
		/*
		try{
		      t1.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		*/
		PrinterThread_2 t2=new PrinterThread_2(p);
		t2.start();
		System.out.println("====Aplication end=====");
	}
}

