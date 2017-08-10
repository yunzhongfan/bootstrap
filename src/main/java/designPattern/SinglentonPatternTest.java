package designPattern;

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
	}
}
