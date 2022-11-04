package com.arabsoft.ajir.controller;

public class LoginRequest {

	private String matpers;

	private String usepswd;

	public LoginRequest() {
		super();
	}

	public LoginRequest(String matpers, String usepswd) {
		super();
		this.matpers = matpers;
		this.usepswd = usepswd;
	}

	public String getMatpers() {
		return matpers;
	}

	public void setMatpers(String matpers) {
		this.matpers = matpers;
	}

	public String getUsepswd() {
		return usepswd;
	}

	public void setUsepswd(String usepswd) {
		this.usepswd = usepswd;
	}

}
