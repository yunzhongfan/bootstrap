package designPattern.decoratorpattern;

public abstract class Decorator extends Component{
	private  Component component;
	
	
	//通过构造函数传递被修饰者
	public Decorator( Component component){
		this.component = component;
	}
	/*public  void sayHello(){
		System.out.println("hello ,everyBody!");
	}*/
	
	/**
	 * 委托给被修饰者执行
	 */
	public void sayContext() {
		this.component.sayContext();
	}
	
}
