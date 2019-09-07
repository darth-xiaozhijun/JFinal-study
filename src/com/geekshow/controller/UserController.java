package com.geekshow.controller;

import com.geekshow.vo.User;
import com.jfinal.core.Controller;

public class UserController extends Controller{

	public void add(){
//		String name = getPara("name");
//		int age = getParaToInt("age");
//		System.out.println("姓名："+name+" \t年龄:"+age);
		User user = getModel(User.class);
		System.out.println("姓名："+user.getName()+"   年龄："+user.getAge());
		setAttr("msg", "添加成功！！！");
		render("/success.jsp");
	}
}
