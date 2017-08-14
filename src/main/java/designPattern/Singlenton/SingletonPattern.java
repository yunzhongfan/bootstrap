package designPattern.Singlenton;


/**
 * 
 * 饿汉单例模式
 * 存在线程不同步，不安全的问题，对象的实例化，需要时间，在高并发的环境下，容易在内存中出现多个对象
 * 
 *一般单例模式的通用模式 
 *
 * @author nbc
 *
 */
public class SingletonPattern {
	
	
	private static final SingletonPattern  singletonPattern = new SingletonPattern();
	private  SingletonPattern(){
		
	}
	
	public  static SingletonPattern getSingletonPatternInstance(){
		return singletonPattern;
	}

	
	public  static void doSomething(){
		System.out.println(SingletonPattern.class.getName()+"I'm doSomething method!");
		System.out.println("如读取配置、 产生其他依赖对象,单例模式可以避免对资源的多重占用， 例如一个写文件动作， 由于只有一个实例存在"
+"内存中， 避免对同一个资源文件的同时写操作");
	}
}
