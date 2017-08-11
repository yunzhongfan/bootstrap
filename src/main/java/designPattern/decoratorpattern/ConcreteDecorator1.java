package designPattern.decoratorpattern;

public class ConcreteDecorator1 extends Decorator {
	//定义被修饰者
	public ConcreteDecorator1(Component component) {
		super(component);
	}
	
	//定义自己的修饰方法
	public  void sayHello(){
		System.out.println("hello ,everyBody!");
	}
	
	//重写父类的Operation方法
	public void sayContext() {
		this.sayHello();
		super.sayContext();
	}
	
}
	
