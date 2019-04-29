package org.javacore.nio;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;


/**
 * @author Jeff Lee
 * @since 2015-10-11 19:51:10
 * 可用的CharSet打印
 */
public class AvailableCharSets {
    public static void main(String[] args) {
        // charset对象的有序映射
        SortedMap<String, Charset> charSets = Charset.availableCharsets();

        // 获取key的迭代器
        Iterator<String> iterator = charSets.keySet().iterator();

        while (iterator.hasNext()) {
            String csName = iterator.next();
            System.out.print(csName);
            // 获取别名的Charset集合的迭代器
            Iterator aliases = charSets.get(csName).aliases().iterator();
            if (aliases.hasNext())
                System.out.print("： ");
            while (aliases.hasNext()) {
                System.out.print(aliases.next());
                if (aliases.hasNext())
                    System.out.print(",");
            }
            System.out.println();
        }
    }
}
