package com.geekshow.controller;

import com.jfinal.core.Controller;

public class HelloController extends Controller{
	public void index(){
		renderText("hello Jfinal");
	}
	public void testes(){
		renderText("test");
	}
}
