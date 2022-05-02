/*Write a program to create two threads, one thread will print odd numbers and second
thread will print even numbers between 1 to 20 numbers..*/
public class lab_9b{
public static void main(String[] args) {
	
               odd o1= new odd();
               Thread t1=new Thread (o1);
               
               		even e1= new even();
               		Thread t2=new Thread (e1);
               
               		t1.start();
               		t2.start();
               
	}
}


class odd implements Runnable {
public void run (){
		for(int i=0;i<20; i++){
			if(i%2==0){
		try {
		Thread.sleep(2000);

		System.out.println("the odd number is======" +i);
		}
					
 			catch(Exception e)
 			{
 		
 			}
 		}
 		}

}
	}
class even implements Runnable {
	public void run(){
for(int j=0;j<20;j++){
		if(j%2!=0){
		try {
		Thread.sleep(2000);
		System.out.println("the even number is=====" +j);
		}
	
 			catch(Exception e)
 			{
 				
 		}
 	}
 			}
}

}





