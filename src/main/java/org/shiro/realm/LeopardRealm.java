package org.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.cj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class LeopardRealm extends AuthorizingRealm {
	
	  @Autowired
	    private UserService userService;

	/**
	 * 授权方法，在配有缓存的情况下，只加载一次。
	 */
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		// 获取用户信息的所有资料，如权限角色等.
		// info.setStringPermissions(权限集合);9. //info.setRoles(角色集合);
		return info;
	}


	/**
	 * 登陆认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		UsernamePasswordToken usernamePasswordToke = (UsernamePasswordToken) token;
		String username = usernamePasswordToke.getUsername();
		//return new SimpleAuthenticationInfo(new ShiroUser("admin", "admin"), "admin", ByteSource.Util.bytes("admin"),getName());
	return null;
	}

}
