package outOfMemoryError;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ʱ���������
 * 
 * VM Args : -XX:PermSize=10M -XX:MaxPermSize=10M
 * 
 * ���н����
 * 		java.lang.OutOfMemoryError: PermGen space
 * 
 * String.intern()�����ã�������а���һ������String������ַ������򷵻س�������ַ�����String����
 * 					          ��������ڣ�����String����������ַ�����ӵ��������У������ش�String���������
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
