package org.javacore.collection.set;

import java.util.HashSet;
import java.util.Set;


/**
 * @author Jeff Lee
 * @since 2015-6-19 15:46:37
 * 	HashSet的Add方法
 */
public class HashSetT{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args){
		Set h1 = new HashSet<String>();
		h1.add("List");
		h1.add(new String("List"));
		h1.add("List");
		h1.add("Set");
		h1.add("Queue");
		h1.add("Map");
		// 注意排序
		System.out.println("HashSet Elements:");
		System.out.print("\t" + h1 + "\n");
	}
}
