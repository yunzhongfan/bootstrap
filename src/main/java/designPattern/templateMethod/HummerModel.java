package designPattern.templateMethod;


/**
 * 模板方法，可以有一个或几个， 一般是一个具体方法， 也就是一个框架， 实现对基本方法的调度，
完成固定的逻辑。
 * @author nbc
 *
 */

public abstract class HummerModel {
	

	protected void  run (){
		//先发动汽车
		this.start();
		//引擎开始轰鸣
		this.engineBoom();
		//然后就开始跑了， 跑的过程中遇到一条狗挡路， 就按喇叭
		if(isAlarm()){
			this.alarm();
		}
		//到达目的地就停车
		this.stop();
	}

	protected abstract void alarm() ;

	protected abstract void stop(); 

	protected abstract void engineBoom() ;

	protected abstract void start();
	
	
	/**
	 * 钩子方法，一般可以在子类中重写，一般用于子类控制父类的流程条件
	 * @return
	 */
	protected boolean isAlarm() {
		return true;
	}

}
