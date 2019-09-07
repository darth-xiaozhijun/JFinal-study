package com.geekshow.jfinal;

import com.geekshow.controller.HelloController;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;

public class DemoConfig extends JFinalConfig {
	//配置常量
	public void configConstant(Constants me) {
		//设置开发模式
		me.setDevMode(true);
	}
	public void configRoute(Routes me) {
		me.add("/hello", HelloController.class);
	}
	public void configPlugin(Plugins me) {}
	public void configInterceptor(Interceptors me) {}
	public void configHandler(Handlers me) {}
}