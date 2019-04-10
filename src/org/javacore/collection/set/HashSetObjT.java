package org.javacore.collection.set;

import java.util.HashSet;

/**
 * @author Jeff Lee
 * @since 2015-6-19 15:41:03
 * 	HashSet 操作对象的决定因子：hashCode与equals
 */
public class HashSetObjT{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args){
		HashSet objs = new HashSet();
		objs.add(new A());
		objs.add(new B());
		objs.add(new C());
		objs.add(new A());
		objs.add(new B());
		objs.add(new C());
		System.out.println("HashSet Elements:");
		System.out.print("\t" + objs + "\n");
	}
}
class A {
	public boolean equals(Object obj){
		return true;
	}
}

class B {
	@Override
    public int hashCode(){
		return 1;
	}
}

class C {
	@Override
    public int hashCode(){
		return 2;
	}

	@Override
    public boolean equals(Object obj){
		return true;
	}
}