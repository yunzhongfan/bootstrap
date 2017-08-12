package designPattern.decoratorpattern;

public class DecoratorPatterTest {

	public static void main(String[] args) {
		Component c1 = new ReportComponent();
		ConcreteDecorator1 concreteDecorator1 = new ConcreteDecorator1(c1);
		c1.sayContext();
		System.out.println("=================");
		concreteDecorator1.sayContext();
	}

}
