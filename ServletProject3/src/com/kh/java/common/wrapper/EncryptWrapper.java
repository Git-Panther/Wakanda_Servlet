package com.kh.java.common.wrapper;

import java.security.MessageDigest;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class EncryptWrapper extends HttpServletRequestWrapper {

	public EncryptWrapper(HttpServletRequest request) {
		super(request);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getParameter(String name) {
		// TODO Auto-generated method stub
		if(name != null & "pw".equals(name)){
			// SHA-512 처리
			return getSha512(super.getParameter(name)); // SHA-512 형식으로 암호화하여 반환
		} else {
			return super.getParameter(name); // 일반적인 반환
		}	
	}
	
	private String getSha512(String pw){
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-512"); // SHA-512 암호화 준비
			md.update(pw.getBytes("UTF-8")); // UTF-8 형식으로 byte 배열 뽑아서 md에 적용
			return Base64.getEncoder().encodeToString(md.digest());
		} catch (Exception e) { // NoSuchAlgorithmException or more
			// TODO Auto-generated catch block
			System.out.println("Encrypting by SHA-512 failed.");
			e.printStackTrace();
			return null;
		}	
	}
}
