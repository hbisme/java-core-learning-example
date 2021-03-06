package org.javacore.collection.map;

import java.util.HashMap;



/**
 * @author Jeff Lee
 * @since 2015-6-18 22:05:44
 * 	HashMap 操作对象的决定因子：hashCode与equals
 */
public class HashMapObjT{
	public static void main(String[] args){
		HashMap<A, Integer> hashMapA = new HashMap<A, Integer>();
		hashMapA.put(new A(), 10);
		hashMapA.put(new A(), 5);
		System.out.println("HashMapA Elements:");
		System.out.print("\t" + hashMapA + "\n");
		
		HashMap<B, Integer> hashMapB = new HashMap<B, Integer>();
		hashMapB.put(new B(), 10);
		hashMapB.put(new B(), 5);
		System.out.println("HashMapB Elements:");
		System.out.print("\t" + hashMapB + "\n");
		
		HashMap<C, Integer> hashMapC = new HashMap<C, Integer>();
		hashMapC.put(new C(), 10);
		hashMapC.put(new C(), 5);
		System.out.println("HashMapC Elements:");
		System.out.print("\t" + hashMapC + "\n");
	}
}

class A{
	@Override
    public boolean equals(Object obj){
		return true;
	}
}

class B{
	@Override
    public int hashCode(){
		return 1;
	}
}

class C{
	@Override
    public int hashCode(){
		return 2;
	}

	@Override
    public boolean equals(Object obj){
		return true;
	}
}