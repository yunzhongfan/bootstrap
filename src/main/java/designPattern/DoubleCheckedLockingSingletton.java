package designPattern;

/**
 * 
 * 通过双重检查锁设置的单例模式
 * 
 *  优点：尽管懒汉模式枷锁这样做到了线程安全，并且解决了多实例问题，但并不高效。在任何调用这个方法的时候，你都需要承受同步带来的性能开销，
 * 然而同步只在第一次调用的时候才被需要，也就是单例类实例创建的时候。这将促使我们使用双重检查锁模式（double checked locking
 * pattern），一种只在临界区代码加锁的方法。程序员称其为双重检查锁，因为会有两次检查 _instance ==
 * null，一次不加锁，另一次在同步块上加锁。这就是使用Java双重检查锁的示例
 * 
 * @author nbc
 *
 */

public class DoubleCheckedLockingSingletton {

	
	
	/**
	 * 如果没有volatile修饰符则可能出现一个线程t1的B操作和另一线程t2的C操作之间对instance的读写没有happens-before，
	 * 可能会造成的现象是t1的B操作还没有完全构造成功，但t2的C已经看到instance为非空，这样t2就直接返回了未完全构造的instance的引用
	 * ，t2想对instance进行操作就会出问题.
	 * 
	 * volatile 的功能: 1. 避免编译器将变量缓存在寄存器里 2. 避免编译器调整代码执行的顺序
	 */
private volatile static NotSafeSinglentonPattern notSafeSinglentonPattern = null;


	public static synchronized NotSafeSinglentonPattern getNotSafeSinglentonPattern() {
		
			if (notSafeSinglentonPattern == null) {
				synchronized (DoubleCheckedLockingSingletton.class) {
					if(notSafeSinglentonPattern == null){
						notSafeSinglentonPattern = new NotSafeSinglentonPattern();
					}
				}
			}
		return notSafeSinglentonPattern;
	}
	
	public static void doSomething() {
		System.out.println(DoubleCheckedLockingSingletton.class.getName()+"I'm doSomething method!");
	}
}
