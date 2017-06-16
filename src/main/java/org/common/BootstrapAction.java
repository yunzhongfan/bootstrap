package org.common;

import javax.servlet.ServletContext;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;


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
	public ServletContext getServletContexts() {
		
		WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();    
        ServletContext servletContext = webApplicationContext.getServletContext(); 
		return servletContext;
	}

	
	/*public Session getSession (){
	    HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();  
	
	}*/
}
