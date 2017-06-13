package org.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户登录模块
 * 
 * @author nbc
 *
 */

@Controller
@RequestMapping("/login")
public class LonginController {

	@RequestMapping("/userLogin")
	public String userLogin(Model model) {
		return "/homePage";
	}

	@RequestMapping("/doLogin")
	public String doLogin() {
		return "/login";
	}
	@RequestMapping("/loginOut")
	public String loginOut() {
		return "/login";
	}

	
	/**
	 * 登录
	 * @param request
	 * @param response
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response, String username,
			String password) {
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		// 记录该令牌
		token.setRememberMe(false);
		// subject 权限对象
		Subject subject = SecurityUtils.getSubject();
		try {
			subject.login(token);
		} catch (UnknownAccountException ex) {// 用户名没有找到
			ex.printStackTrace();
		} catch (IncorrectCredentialsException ex) {// 用户名密码不匹配
			ex.printStackTrace();
		} catch (AuthenticationException e) {// 其他的登录错误
			e.printStackTrace();
		}

		// 验证是否成功登录的方法
		if (subject.isAuthenticated()) {
			return new ModelAndView("/main/index.jsp");
		}
		return new ModelAndView("/login/login.jsp");
	}

	// 退出
	@RequestMapping("/logout")
	public void logout() {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
	}

}
