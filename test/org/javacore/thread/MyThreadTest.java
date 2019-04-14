package org.javacore.thread;


/**
 * @author Jeff Lee
 * @since 2015-7-4 16:15:38
 * 	Thread的简单实用测试 {@link MyThread}
 */
public class MyThreadTest {
	public static void main(String[] args) {
		// 创建线程
		MyThread mThread = new MyThread();
		// 启动线程
		mThread.start();
	}
}
