package designPattern.templateMethod;

/**
 * 基本方法
 * 基本方法也叫做基本操作， 是由子类实现的方法， 并且在模板方法被调用
 * @author nbc
 *
 */
public class HummerH2Model extends HummerModel {
	
	//设置是否可以有声音
		private  boolean alarmflag =true;
	@Override
	protected void alarm() {
		System.out.println("this is  HummerH2Model alarm!");

	}

	@Override
	protected void stop() {
		System.out.println("this is  HummerH2Model stop!");

	}

	@Override
	protected void engineBoom() {
		System.out.println("this is  HummerH2Model engineBoom!");

	}

	@Override
	protected void start() {
		System.out.println("this is  HummerH2Model start!");
	}
	
	/**
	 * 从写父类的钩子方法
	 */
	@Override
	protected boolean isAlarm() {
		return alarmflag;
	}
	
	public  void  setAlarm(Boolean flag){
		this.alarmflag = flag;
	}
	

}
