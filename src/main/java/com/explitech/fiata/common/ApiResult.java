package com.explitech.fiata.common;

import org.codehaus.jackson.map.annotate.JsonView;


public class ApiResult {

	public static final String OK = "OK";
	public static final String ERROR = "ERROR";
	
	public static final String ERROR_EMAIL_REGISTERED = "REGISTERED";
	
	@JsonView({ServiceObjectView.ApiResultView.class})
	private String code = OK;
	
	@JsonView({ServiceObjectView.ApiResultView.class})
	private String reason;
	
	@JsonView({ServiceObjectView.ApiResultView.class})
	private String data;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
	
}
