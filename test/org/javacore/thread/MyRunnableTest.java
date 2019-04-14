package org.javacore.thread;


/**
 * @author Jeff Lee
 * @since 2015-7-4 16:15:38
 * 	Thread的简单实用测试 {@link MyRunnable}
 */
public class MyRunnableTest {
	public static void main(String[] args) {
		// 创建线程
		Thread thread = new Thread(new MyRunnable());
		// 启动线程
		thread.start();
	}
}
