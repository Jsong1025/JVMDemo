package stackOverflowError;

/**
 * ����ջ�ͱ��ط���ջ���
 * 		
 * ���н����
 * 		stack length:9506
 * 		Exception in thread "main" java.lang.StackOverflowError
 * 
 * ���߳��£�������ջ̫֡�󣬻������������̫С�����ڴ��޷�����ʱ���׳��Ķ���StackOverflowError
 *
 */
public class JavaVMStackSOF {
	
	private int stackLength = 1;
	
	public void stackLeak(){
		stackLength++;
		stackLeak();
	}
	
	public static void main(String[] args) throws Throwable {
		JavaVMStackSOF oom = new JavaVMStackSOF();
		try {
			oom.stackLeak();
		} catch (Throwable e) {
			System.out.println("stack length:"+oom.stackLength);
			throw e;
		}
	}

}
