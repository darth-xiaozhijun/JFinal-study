package com.geekshow.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * MultipartRequestInterceptor
 * 解决POST提交，无上传带Multipart-data
 */
public class MultipartRequestInterceptor implements Interceptor {

	public void intercept(Invocation ai) {
		String content_type = ai.getController().getRequest().getContentType();
		if (content_type != null
				&& content_type.toLowerCase().indexOf("multipart") != -1) {
			ai.getController().getFiles();
		}
		ai.invoke();
	}

}
