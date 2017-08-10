package org.common;

import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.websocket.Session;

import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;


/**
 * bootstrap的公共类
 * @author Administrator
 *
 */
public abstract class BootstrapAction {

	
	/**
	 * 获取httpServlet
	 * @return
	 */
	public static ServletContext getServletContexts() {
		
		WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();    
        ServletContext servletContext = webApplicationContext.getServletContext(); 
		return servletContext;
	}
/**
 * 获取local
 * @param request
 * @return
 */
	public static Locale getLocaleContext(){
		//获取localhostHolder中保存的localcontext
		LocaleContext priviousLocaleContext = LocaleContextHolder.getLocaleContext();
		Locale locale = priviousLocaleContext.getLocale();
		return locale;
		}
	
	/**
	 * 
	 */
	
	public static  Session  getSession(){
		RequestAttributes   requestAttribute = RequestContextHolder.getRequestAttributes();
		return null;
	}
	/*public Session getSession (){
	    HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();  
	
	}*/
}
