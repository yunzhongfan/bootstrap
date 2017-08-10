package designPattern;

/**
 * 懒汉单例模式,if(notSafeSinglentonPattern==null)容易出现线程不安全的问题
 * 懒汉模式比饿汉模式有改进，改进了程序的效率 仍然存在线程不安全的问题，对象的实例化，需要时间，在高并发的环境下，容易在内存中出现多个对象
 * 
 * 改进 
 * synchronized 可以在getSingleton方法前加synchronized关键字， 也可以
 *	在getSingleton方法内增加synchronized来实现解决线程不安全的问题，
 *
 *改进
 *通过双重检查锁（ http://www.importnew.com/12196.html）设置。
 *但是最好的方法是使用枚举实现单例模式，这种方法在实例创建时提供了内置的线程安全。另一种方法是使用静态持有者模式（static holder pattern）。
 * @author nbc
 *
 */
public class NotSafeSinglentonPattern {

	private static NotSafeSinglentonPattern notSafeSinglentonPattern = null;


	

	public static synchronized NotSafeSinglentonPattern getNotSafeSinglentonPattern() {
		/*
		 * //这样做存在线程不安全
		 * if(notSafeSinglentonPattern==null){ notSafeSinglentonPattern = new
		 * NotSafeSinglentonPattern(); }
		 */
		// 通过synchronized 在 getNotSafeSinglentonPattern 关键字可以改进线程不安全的问题，但是在高并发的环境下容易出现执行效率低的问题
		
			if (notSafeSinglentonPattern == null) {
				notSafeSinglentonPattern = new NotSafeSinglentonPattern();
			}
		
		return notSafeSinglentonPattern;
	}
	
	
	public static void doSomething() {
		System.out.println(NotSafeSinglentonPattern.class.getName()+"I'm doSomething method!");
	}

}
