package com.PanSeeding.PanSeeding.model;

public class Response {
	
	private String requestData;

	public String getRequestData() {
		return requestData;
	}

	public void setRequestData(String requestData) {
		this.requestData = requestData;
	}

	public Response(String requestData) {
		this.requestData = requestData;
	}

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Response [requestData=" + requestData + "]";
	} 

}
