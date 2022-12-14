package com.OnWeb.demo.dto;

import java.time.LocalDateTime;

public class ResponseDTO {
	private String mesg;
	private LocalDateTime ts;

	public ResponseDTO() {
		System.out.println("in ctor of " + getClass().getName());
	}

	public ResponseDTO(String mesg, LocalDateTime ts) {
		super();
		this.mesg = mesg;
		this.ts = ts;
	}

	public String getMesg() {
		return mesg;
	}

	public void setMesg(String mesg) {
		this.mesg = mesg;
	}

	public LocalDateTime getTs() {
		return ts;
	}

	public void setTs(LocalDateTime ts) {
		this.ts = ts;
	}
}
