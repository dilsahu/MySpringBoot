package io.javabrains;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread myThread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed inside runnable");
				
			}
		});
myThread.run();
	Thread myLambdaThread=new Thread(()->System.out.println("inside lambda"));
	myLambdaThread.run();
	}

}
