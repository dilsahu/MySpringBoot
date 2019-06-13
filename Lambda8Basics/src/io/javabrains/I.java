package io.javabrains;

public interface I {

	//public void show();
	
	default void show()
	{
		System.out.println("in intereface I");
	}
}
