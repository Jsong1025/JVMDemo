package heapDumpOnOutOfMemoryError;

import java.util.ArrayList;
import java.util.List;

/**
 * java�����
 * 
 * ���н����
 * 		java.lang.OutOfMemoryError: Java heap space
 * 
 */
public class HeapOOM {

	static class OOMObject {}
	
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<HeapOOM.OOMObject>();
		int i = 0;
		while (true) {
			list.add(new OOMObject());
		}
	}
	
}
