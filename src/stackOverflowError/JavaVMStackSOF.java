package stackOverflowError;

/**
 * 虚拟栈和本地方法栈溢出
 * 		
 * 运行结果：
 * 		stack length:9506
 * 		Exception in thread "main" java.lang.StackOverflowError
 * 
 * 单线程下，无论是栈帧太大，还是虚拟机容量太小，当内存无法分配时，抛出的都是StackOverflowError
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
