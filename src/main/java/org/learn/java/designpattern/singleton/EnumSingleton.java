package org.learn.java.designpattern.singleton;

public enum EnumSingleton {

	INSTANCE;
	private EnumSingleton() {
		System.out.println("Here");
	}
}


//which is same as


/*


public final class MySingleton {
    public final static MySingleton INSTANCE = new MySingleton();
    private MySingleton(){} 
}

*/