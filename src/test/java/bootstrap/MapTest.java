package bootstrap;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		 Map<String,String> map = HashMap.class.newInstance();
		 map.put("1", "2");
		// map.putAll(map);
		 System.err.println(map.toString());
	}
	

}
