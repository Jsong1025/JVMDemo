package outOfMemoryError;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行时常量池溢出
 * 
 * VM Args : -XX:PermSize=10M -XX:MaxPermSize=10M
 * 
 * 运行结果：
 * 		java.lang.OutOfMemoryError: PermGen space
 * 
 * String.intern()的作用：如果池中包含一个等于String对象的字符串，则返回池中这个字符串的String对象
 * 					          如果不存在，将此String对象包含的字符串添加到常量池中，并返回次String对象的引用
 * 
 */
public class RuntimeConstantPoolOOM {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		int i = 0;
		while (true) {
			list.add(String.valueOf(i++).intern());
		}
	}

}
