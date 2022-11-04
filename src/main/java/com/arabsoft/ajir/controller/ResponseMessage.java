package com.arabsoft.ajir.controller;

public class ResponseMessage {
	  private String code;	
	  private String message;

	  public ResponseMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseMessage(String message) {
	    this.message = message;
	  }

	  public String getMessage() {
	    return message;
	  }

	  public void setMessage(String message) {
	    this.message = message;
	  }
	  
	  public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}
		
		@Override
	    public String toString() {
	        return "ResponseMessage{" +
	                "code='" + code + '\'' +
	                ",message='" + message + '\'' +
	                '}';
	    }

}