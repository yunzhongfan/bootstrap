package designPattern.Singlenton;

/**
 * 借助静态内部类方法实现单例模式
 * 内部类的单例模式借助JVM规范，内部类产生的单一实例
 * @author nbc
 *
 */
public class InnerStaticClassSinglentonPatter {
	
	private InnerStaticClassSinglentonPatter(){
		
	}
	
	private static class SingletonHolder {  
        private static final InnerStaticClassSinglentonPatter INSTANCE = new InnerStaticClassSinglentonPatter();  
}  

	public  static  InnerStaticClassSinglentonPatter getInnerStaticClassSinglentonPatterInstance(){
		return SingletonHolder.INSTANCE;
		
	}
	
	public void doSomething(){
		System.out.println(InnerStaticClassSinglentonPatter.class.getName()+"do something!");
	}

}
