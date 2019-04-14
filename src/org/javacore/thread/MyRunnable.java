package org.javacore.thread;


/**
 * @author Jeff Lee
 * @since 2015-7-4 16:14:47
 * 	Runnable接口的简单使用
 * 	测试 --> {@link MyRunnableTest}
 */
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("MyRunnable --> run()");
	}

}
