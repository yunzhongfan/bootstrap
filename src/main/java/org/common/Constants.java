package org.common;


/**
 * 工具类
 * @author Administrator
 *
 */
public enum Constants {
	
	SESSIONKEY("session_key");

	public static final String ADD = "ADD";

	public static final String GET = "GET";

	public static final String MODIFY = "MODIFY";

	public static final String ADD_DIR = "ADD_DIR";

	public static final String REMOVE = "REMOVE";

	public static final String REMOVE_DIR = "REMOVE_DIR"; 
	
	private  String constantsValue;

	private Constants(String constantsValue){
		
		this.constantsValue=constantsValue;
		
	}
	
	public String getConstantsValue() {
		return constantsValue;
	}

}
