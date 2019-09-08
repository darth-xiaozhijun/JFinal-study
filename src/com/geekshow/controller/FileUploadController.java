package com.geekshow.controller;


import com.geekshow.interceptor.MultipartRequestInterceptor;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.upload.UploadFile;

@Before(MultipartRequestInterceptor.class)
public class FileUploadController extends Controller{
	public void upload(){
		UploadFile file = getFile("file");
		render("/index.jsp");
	}
}
