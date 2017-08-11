package designPattern.templateMethod;


/***
 * 基本方法，由模板方法调用
 * @author nbc
 *
 */
public class HummerH1Model extends HummerModel {
	//设置是否可以有声音
	private  boolean alarmflag =true;
	@Override
	protected void alarm() {
			System.out.println("this is  HummerH1Model alarm!");

	}

	@Override
	protected void stop() {
		System.out.println("this is  HummerH1Model stop!");

	}

	@Override
	protected void engineBoom() {
		System.out.println("this is  HummerH1Model engineBoom!");

	}

	@Override
	protected void start() {
		System.out.println("this is  HummerH1Model start!");
	}
	
	/**
	 * 从写父类的钩子方法
	 */
	@Override
	protected boolean isAlarm() {
		return  this.alarmflag;
	}
	public void  setAlarm(boolean alarmflag){
		this.alarmflag = alarmflag;
	}

}
