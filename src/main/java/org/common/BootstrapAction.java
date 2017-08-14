package org.common;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
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
public abstract class BootstrapAction extends GenericServlet  {

	public  ServletConfig  servletConfig;
	public ServletContext servletContext;
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
	public ServletConfig getServletConfig(){
		 this.servletConfig =super.getServletConfig();
		return servletConfig;
	}
	
	public  ServletContext getServletContext(){
		 servletContext=super.getServletContext();
		 
		 return servletContext;
	}
	public static  Session  getSession(){
		RequestAttributes   requestAttribute = RequestContextHolder.getRequestAttributes();
		return null;
	}
	/*public Session getSession (){
	    HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();  
	
	}*/
}
