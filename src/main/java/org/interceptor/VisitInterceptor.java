package org.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



/**
 * 登录页面的拦截处理
 * 拦截器测试
 * @author nbc
 *
 */
public class VisitInterceptor extends HandlerInterceptorAdapter {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("afterCompletion");

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("postHandle");

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
			String  serletPath = 	request.getServletPath();
			System.out.println("serletPath="+serletPath);
			String  contextPath = 	request.getContextPath();
			System.out.println("contextPath="+contextPath);
			if("/bootstrapu".equals(serletPath)){
				System.out.println("直接跳到文本副页面编辑页面");
				response.sendRedirect("/static/utf8-jsp/index.html");
				return false;
			}
			return true;
			
	}
}
