package com.geekshow.jfinal;

import com.geekshow.controller.HelloController;
import com.geekshow.controller.UserController;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.render.ViewType;

public class BaseConfig extends JFinalConfig {
	//配置常量
	public void configConstant(Constants constants) {
		
		//设置开发模式
		constants.setDevMode(true);
		constants.setViewType(ViewType.JSP);
	}
	
	public void configRoute(Routes routes) {
		
		routes.add("/hello", HelloController.class);
		routes.add("/user", UserController.class);
	}
	
	public void configPlugin(Plugins me) {}
	public void configInterceptor(Interceptors me) {}
	public void configHandler(Handlers me) {}
}