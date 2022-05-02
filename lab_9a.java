/*Write an application that executes two threads. One thread displays "Good Morning"
every 1000 milliseconds & another thread displays "Good Afternoon" every 3000
milliseconds. Create the threads by implementing the Runnable interface.*/

public class lab_9a{
public static void main(String[] args) {
	
               Runnable1 R1= new Runnable1();
               Thread t1=new Thread (R1);
               
               		Runnable2 R2= new Runnable2();
               		Thread t2=new Thread (R2);
               
               		t1.start();
               		t2.start();


	}
}


class Runnable1 implements Runnable {
public void run (){
		for(;;){
		try {
		Thread.sleep(1000);
		System.out.println("good morning");
		}
 			catch(Exception e)
 			{
 		
 			}
 		}

}
	}
class Runnable2 implements Runnable {
	public void run(){
for(;;){
		try {
		Thread.sleep(3000);
		System.out.println("good afternoon");
		}
 			catch(Exception e)
 			{
 				
 		}
 			}
}

}





