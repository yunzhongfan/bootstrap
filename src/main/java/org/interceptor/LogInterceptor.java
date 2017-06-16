package org.interceptor;

import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


/**
 * 系统操作日志拦截
 * @author Administrator
 *
 */
public class LogInterceptor extends HandlerInterceptorAdapter{
	
	private static final Logger loger = Logger.getLogger(LogInterceptor.class);
	
	
	/*public boolean preHandle(HttpServletRequest request,  
	         HttpServletResponse response, Object handler) throws Exception {  
		 	loger.info("" + request.getRequestURI());  
	      if(!HandlerMethod.class.isAssignableFrom(handler.getClass())){  
	         return true;  
	      }  
	        HandlerMethod handlerMethod = (HandlerMethod) handler;  
	        MethodParameter[] params= handlerMethod.getMethodParameters();  
	        boolean result=true;  
	        for(MethodParameter param:params){  
	            Valid valid=  param.getParameterAnnotation(Valid.class);  
	         RequestParam requestParam = param.getParameterAnnotation(RequestParam.class);  
	         if(requestParam!=null){  
	            if(requestParam.required()){  
	               String paramValue = request.getParameter(requestParam.value());  
	               if(param.getParameterType()==String.class&& StringUtils.isEmpty(paramValue)){  
	                  OutputStream os = response.getOutputStream();  
	                  os.write("validate failed".getBytes("UTF-8"));  
	                  os.flush();  
	                  os.close();  
	                  return false;  
	               }  
	            }  
	         }  
	            if(valid!=null){  
	                result = validator.validate(valid,request.getParameter(valid.name()));  
	                if(!result){  
	               OutputStream os = response.getOutputStream();  
	                    os.write("validate failed".getBytes("UTF-8"));  
	                    os.flush();  
	                    os.close();  
	                    return false;  
	                }  
	            }  
	        }  
	      String userId = (String) request.getSession().getAttribute("userId");  
	      if(userId!=null){  
	         UserLoginHolder.handleCurrentUser(userId);  
	      } 
	    //  return result;
		
	   }  */

}
