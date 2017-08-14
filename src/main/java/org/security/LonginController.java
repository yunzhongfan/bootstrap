package org.security;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.common.BootstrapAction;
import org.interceptor.LogInterceptor;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
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
public class LonginController extends BootstrapAction implements EnvironmentAware{
	
	
	private static final Logger loger = Logger.getLogger(LonginController.class);
	
  private	Environment environment;//源码学习--EnvironmentAware接口

	@RequestMapping("/userLogin")
	public String userLogin(Model model) {
		loger.info("登录系统欢迎页面");
		return "/homePage";
	}

	@RequestMapping("/doLogin")
	public String doLogin() throws ServletException {
//		ServletContext servletContext = httpServletRequest.getServletContext();
//		ServletConfig  servletConfig = genericServlet.getServletConfig();
//		loger.info("servletContext.getServletNames()="+servletContext.getServletNames());
//		loger.info("servletContext.getServerInfo()="+servletContext.getServerInfo());
//		loger.info("servletContext.getServletContextName()="+servletContext.getServletContextName());
//		Servlet  servlet = servletContext.getServlet("springMVC");
//		loger.info("servletContext.getServlet(springMVC)="+servletContext.getServlet("springMVC").toString());
		return "/login";
	}
	
//	@RequestMapping("/doLogin")
//	public String doLogin(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse,GenericServlet genericServlet) throws ServletException {
//		ServletContext servletContext = httpServletRequest.getServletContext();
//		ServletConfig  servletConfig = genericServlet.getServletConfig();
//		loger.info("servletContext.getServletNames()="+servletContext.getServletNames());
//		loger.info("servletContext.getServerInfo()="+servletContext.getServerInfo());
//		loger.info("servletContext.getServletContextName()="+servletContext.getServletContextName());
//		Servlet  servlet = servletContext.getServlet("springMVC");
//		loger.info("servletContext.getServlet(springMVC)="+servletContext.getServlet("springMVC").toString());
//		return "/login";
//	}
	
	
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
	@RequestMapping("/userLogin1")
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response, String username,
			String password) {
		loger.info("用户登录");
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

	
	
	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
