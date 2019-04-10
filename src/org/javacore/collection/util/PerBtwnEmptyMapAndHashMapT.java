package org.javacore.collection.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jeff Lee
 * @since 2015-6-19 16:03:10
 * 	Collections.EMPTY_MAP 与 new HashMap 性能对比
 * 场景：webservice接口，根据某些条件直接返回空Map，则使用Collections.EMPTY_MAP。
 */
public class PerBtwnEmptyMapAndHashMapT {
	@SuppressWarnings({"unused", "rawtypes"})
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		long endTime;
		long duration; 
		for (int i = 0; i < 100000000; i++) {
			Map map = Collections.EMPTY_MAP;
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("Collections.EMPTY_MAP:  " + duration);
		
		startTime = System.nanoTime();
		for (int i = 0; i < 100000000; i++) {
			Map map = new HashMap<>();
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("new HashMap:  " + duration);
	}
}
