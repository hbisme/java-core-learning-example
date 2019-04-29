package org.javacore.thread;

/**
 * @author Jeff Lee
 * @since 2015-11-2 17:06:48
 * 	线程简单使用-启动LiftOff线程{@link LiftOff}
 */
public class BasicThreads {
    public static void main(String[] args) {
        // 创建新的线程
        Thread t = new Thread(new LiftOff());
        // 执行线程
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
