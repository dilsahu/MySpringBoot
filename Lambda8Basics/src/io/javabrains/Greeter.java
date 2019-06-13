package io.javabrains;

public class Greeter {
	
	public void greet(Greeting greeting)
	{
		greeting.perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greeter=new Greeter();
		Greeting helloworldgreetings=new HelloWorldGreeting();
		
		Greeting lambdaGreetings=()->System.out.println("inside my lamdba");
		greeter.greet(lambdaGreetings);
}

}
