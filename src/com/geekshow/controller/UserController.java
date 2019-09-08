package com.geekshow.controller;

import java.util.List;

import com.geekshow.vo.User;
import com.jfinal.core.Controller;

public class UserController extends Controller {

	public void add() {
		// String name = getPara("name");
		// int age = getParaToInt("age");
		// System.out.println("姓名："+name+" \t年龄:"+age);
		User user = getModel(User.class);
//		System.out.println("姓名：" + user.getName() + "   年龄：" + user.getAge());
		setAttr("msg", "添加成功！！！");
		render("/success.jsp");
	}

	public void save() {
		System.out.println("==========" + getPara("birthday"));
		boolean flag = User.dao.set("name", getPara("name")).set("age", getPara("age"))
				.set("birthday", getPara("birthday")).save();
		if (flag)
			setAttr("msg", "添加成功！！！");
			render("/success.jsp");
	}

	public void list() {
		List<User> list = User.dao.find("select * from t_user");
		for (User u : list) {
			u.getAttrsEntrySet();
		}
		setAttr("list", list);
		System.out.println(list.size());
	}
}
