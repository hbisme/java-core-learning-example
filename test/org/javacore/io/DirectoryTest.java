package org.javacore.io;


/**
 * @author Jeff Lee
 * @since 2015-7-13 10:06:56
 * {@link Directory}的测试类
 */
public class DirectoryTest {
	public static void main(String[] args) {
		// 打印当前目录和文件
		System.out.println(Directory.walk("."));
	}
}
