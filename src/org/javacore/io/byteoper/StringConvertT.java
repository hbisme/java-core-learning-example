package org.javacore.io.byteoper;


/**
 * @author Jeff Lee
 * @since 2015-6-19 21:27:41
 * 	String转换成byte数组
 */
public class StringConvertT {

	public static void main(String[] args){
		String str = "李强强";
		byte[] bytes = str.getBytes();
		// 打印字节数组
		System.out.println("UTF-8编码'李强强'的字节数组为：");
		for (int i = 0; i < bytes.length; i++)
			System.out.print("\t" + bytes[i]);
	}
}
