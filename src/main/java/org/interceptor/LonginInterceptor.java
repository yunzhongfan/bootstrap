package org.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



/**
 * 登录页面的拦截处理
 * 拦截器测试
 * @author nbc
 *
 */
public class LonginInterceptor extends HandlerInterceptorAdapter {

	private static final Logger loger = Logger.getLogger(LogInterceptor.class);
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("LonginInterceptorafterCompletion");

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("LonginInterceptorpostHandle");

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
			String  serletPath = 	request.getServletPath();
			System.out.println("LonginInterceptor--serletPath="+serletPath);
				if(null!=serletPath&&serletPath.startsWith("/utf8")){
					 response.sendRedirect("/resources/utf8-jsp/index.html");
					 return  false;
				}
			 if (request.getSession().getAttribute("username") != null) {
				  response.sendRedirect("/login?next=".concat(request.getRequestURI()));
		            return true;
		        }else
		        return true;
		    }
			

}
