package bootstrap.oo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class WW {
	
	
	public static void main(String[] args) {
		Long aa = (long) 1012;
		BigDecimal bg = new BigDecimal(aa);
		BigDecimal  p = 	bg.divide(new BigDecimal(100),2, RoundingMode.HALF_UP);
		System.out.println(p);
	}


}
