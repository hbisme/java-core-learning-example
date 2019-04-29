package org.javacore.io;

import java.io.File;

import java.io.IOException;


/**
 * @author Jeff Lee
 * @since 2015-6-30 14:21:47
 * File类的使用
 */
public class FileT {

	public static void main(String[] args) {
		try {
			// 创建一个目录
			File dir = new File("tmpDir");
			dir.mkdir();
			// 创建一个文件
			File file = new File(dir,"file.txt");
			file.createNewFile();
			
			// 是否是一个目录
			System.out.println(dir.isDirectory());
			// 是否是一个文件
			System.out.println(file.isFile());
			
			// 删除文件
			if (file.delete()) {
				System.out.println(file.getName() + "被删除了！");
			} else {
				System.out.println("文件删除失败！");
			}
		} catch (IOException e) { e.printStackTrace(); }
	}

}
