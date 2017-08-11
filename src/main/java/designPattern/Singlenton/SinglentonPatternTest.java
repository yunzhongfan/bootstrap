package designPattern.Singlenton;

public class SinglentonPatternTest {
	
	
	public static void main(String[] args) {
		/**
		 * 一般通用单例模式测试,饿汉模式
		 */
		 SingletonPattern.doSomething();
		 SingletonPattern singletonPattern = SingletonPattern.getSingletonPatternInstance();
	
			
		/**
			 * 
			 * 懒汉模式测试
		*/
		 NotSafeSinglentonPattern.doSomething();
		 NotSafeSinglentonPattern notSafeSinglentonPattern =NotSafeSinglentonPattern.getNotSafeSinglentonPattern();
	
		/**
		 * 测试多例模式
		 */
		 MorelentonPattern.getDevelopSinglentonPattern().doSomething();
		 
		 /**
		  *内部类的单例模式
		  */
		 LazyInitializationHolderSinglentonPatter.getInstance().dosomething();
		 
		 /**
		  * 双重检查锁的单例模式
		  */
		 DoubleCheckedLockingSingletton.getDoubleCheckedLockingSingletton().doSomething();
	}
}
