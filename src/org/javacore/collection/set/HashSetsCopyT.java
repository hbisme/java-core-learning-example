package org.javacore.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


/**
 * @author Jeff Lee
 * @since 2015-6-18 21:02:07
 * 	HashSet及其子类的转换使用
 */
public class HashSetsCopyT{
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args){
		Set s1 = new HashSet<String>();
		s1.add("List");
		s1.add("Queue");
		s1.add("Set");
		s1.add("Map");
		
		System.out.println("HashSet Elements:");
		System.out.print("\t" + s1 + "\n");
		
		Set s2 = copy(s1);
		System.out.println("HashSet Elements After Copy:");
		System.out.print("\t" + s2 + "\n");
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Set copy(Set set)	{
		Set setCopy = new LinkedHashSet(set);
		return setCopy;
	}
}
