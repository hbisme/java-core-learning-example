package org.javacore.collection.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * @author Jeff Lee
 * @since 2015-6-17 23:32:30
 * 	Collections的使用
 */
public class CollectionsT{
	public static void main(String[] args){
		// 测试集合工具类Sort方法
		testSort();
	}
	
	/**
	 * 测试集合工具类Sort方法
	 */
	private static void testSort(){
		List<Integer> teams = new ArrayList<Integer>();
		teams.add(1);
		teams.add(3);
		teams.add(2);
		teams.add(4);
		// 调用集合工具类Sort方法
		Collections.sort(teams);
		
		System.out.println("Teams:");
		System.out.print("\t" + teams + "\n");
	}
}
