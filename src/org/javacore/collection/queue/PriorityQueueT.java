package org.javacore.collection.queue;

import java.util.PriorityQueue;


/**
 * @author Jeff Lee
 * @since 2015-6-17 23:32:30
 * 	PriorityQueue的使用
 */
public class PriorityQueueT {
	public static void main(String[] args) {
		int[] ia = { 1, 10, 5, 3, 4, 7, 6, 9, 8 };
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
 
		for (int x : ia) {
            pq1.offer(x);
        }
		// 注意排序
		System.out.println("pq1: " + pq1);
	}
}