package org.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SecurityMainframe {
	
	@RequestMapping("/securityMainframe/userBasicInfoPage")
	public String userBasicInfoPage(){
		return "view/sidebar";
	}
	
	@RequestMapping("/securityMainframe/orderPage")
	public String orderPage(){
		return "view/navigation";
	}
	
	@RequestMapping("/securityMainframe/contextPage")
	public String contextPage(){
		return "view/context";
	}

}
