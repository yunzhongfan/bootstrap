package designPattern.templateMethod;


/***
 * 模板方法模式测试
 * @author nbc
 *
 */
public class TempletPatterTest {

	public static void main(String[] args) {
		HummerModel h1 = new HummerH1Model();
		if(h1 instanceof HummerH1Model){
			((HummerH1Model) h1).setAlarm(false);
		}
		h1.run();
		System.out.println("========================");
		HummerModel h2 = new HummerH2Model();
		if(h2 instanceof HummerH2Model){
			((HummerH2Model) h2).setAlarm(true);
		}
		h2.run();
		
		System.out.println("ceshi Method 2============");
		
		HummerH1Model h3 = new HummerH1Model();
		h3.setAlarm(true);
		h3.run();
		System.out.println("========================");
		HummerH2Model h4 = new HummerH2Model();
		h4.setAlarm(false);
		h4.run();
		
	}

}
