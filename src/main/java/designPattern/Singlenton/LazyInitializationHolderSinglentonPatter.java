package designPattern.Singlenton;

/**
 * 内部类静态持有者模式，实现的单例模式
 * 借助JVM规范，内部类的实现的单例安全规范实现单例模式
 * @author nbc
 *
 */

public class LazyInitializationHolderSinglentonPatter {

	 private LazyInitializationHolderSinglentonPatter() {  
     }  

     private static class SingletonHolder {  
             private static final LazyInitializationHolderSinglentonPatter INSTANCE = new LazyInitializationHolderSinglentonPatter();  
     }  

     public static LazyInitializationHolderSinglentonPatter getInstance() {  
             return SingletonHolder.INSTANCE;  
     } 
    public void dosomething(){
    	System.out.println(LazyInitializationHolderSinglentonPatter.class.getName()+"dosomeThing!");
    }
}
