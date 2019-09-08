package com.geekshow.jfinal;

import com.geekshow.controller.FileUploadController;
import com.geekshow.controller.HelloController;
import com.geekshow.controller.UserController;
import com.geekshow.vo.User;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.render.ViewType;

public class BaseConfig extends JFinalConfig {
	// 配置常量
	public void configConstant(Constants constants) {

		// 设置开发模式
		constants.setDevMode(true);
		constants.setViewType(ViewType.JSP);
		constants.setUploadedFileSaveDirectory("my");
	}

	public void configRoute(Routes routes) {

		routes.add("/hello", HelloController.class);
		routes.add("/", UserController.class);
		routes.add("/file", FileUploadController.class);
	}

	public void configPlugin(Plugins me) {

		// C3p0Plugin
		DruidPlugin dp = new DruidPlugin("jdbc:mysql://localhost:3306/jfinal?useUnicode=true&characterEncoding=UTF-8",
				"root", "123456");
		me.add(dp);
		ActiveRecordPlugin rp = new ActiveRecordPlugin(dp);
		me.add(rp);
//		rp.addMapping("t_user", "id", User.class);
		rp.addMapping("t_user", User.class);
		
	}

	public void configInterceptor(Interceptors me) {
	}

	public void configHandler(Handlers me) {
	}
}