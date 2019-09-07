package com.geekshow.controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class HelloController extends Controller{
	
	@ActionKey("/index")
	public void index(){
		renderText("hello Jfinal");
	}
	
	@ActionKey("/testes")
	public void testes(){
		renderText("test");
	}
}
