package designPattern.Singlenton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * 多例模式
 * 解决懒汉模式下synchronized,关键字效率低的问题
 * 
 * 让内存中顶多产生两个DevelopSinglentonPattern实例
 * 
 * @author nbc
 *
 */
public class MorelentonPattern {

	private static final int maxInstanceNum = 2;

	private static List<String> instanceNameList = new ArrayList<String>();
	private static List<MorelentonPattern> instanceObject = new ArrayList<MorelentonPattern>();

	static {
		for (int i = 0; i < maxInstanceNum; i++) {
			instanceObject.add(new MorelentonPattern());
		}
	}

	private MorelentonPattern() {

	}

	private MorelentonPattern(String name) {
		instanceNameList.add(name);
	}

	public static MorelentonPattern getDevelopSinglentonPattern() {
		Random random = new Random();
		int countNum = random.nextInt(maxInstanceNum);
		return instanceObject.get(countNum);
	}
	
	public void doSomething(){
		System.out.println(MorelentonPattern.class.getName()+"I'm doSomething method!");
	}
}
