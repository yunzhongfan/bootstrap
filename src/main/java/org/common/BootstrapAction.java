package org.common;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.Session;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
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
	
	public ServletContext getServletContext() {
		
		WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();    
        ServletContext servletContext = webApplicationContext.getServletContext(); 
		return servletContext;
	}

	
	public Session getSession (){
		Session session = ((HttpServletRequest)RequestContextHolder.getRequestAttributes()).getSession("") ;	
		return  session;
	
	}
}
