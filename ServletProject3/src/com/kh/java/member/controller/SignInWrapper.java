package com.kh.java.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class SignInWrapper extends HttpServletRequestWrapper {	
	public SignInWrapper(HttpServletRequest request) {
		super(request); // 원본 request를 부모 request에 저장
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getParameter(String name) { // pw 한정으로 따로 처리
		// TODO Auto-generated method stub
		if(name != null && "pw".equals(name)){
			return super.getParameter(name) + " The Wrapper has called.";
		} else {
			return super.getParameter(name);
		}
	}
}
