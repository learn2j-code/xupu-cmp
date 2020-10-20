package com.chhtf.cmp.bam_weixinmanagement.service;

import javax.servlet.http.HttpServletRequest;

public interface WxTicketService {
	public String payBack(String notifyData,HttpServletRequest request);
}