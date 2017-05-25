package org.security;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping; 

/**
 * 用户登录模块
 * @author nbc
 *
 */

@Controller
@RequestMapping("/login")
public class LonginController {
	
	
	@RequestMapping("/userLogin")
	public  String   userLogin(Model model){
		return  "/homePage";
	}
	@RequestMapping("/doLogin")
	public  String   doLogin(){
		return  "/login";
	}
	

}
