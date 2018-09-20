/*

* Copyright (c) 2018 Yodlee, Inc. All Rights Reserved.
*
* This software is the confidential and proprietary information of Yodlee, Inc. 
 * Use is subject to license terms.
*/
package com.yodlee.casemanagement.web.dto.sr;


public class AccountDto {

	private String container;
	private Long memItemAccountId;
	private Long memItemId;
	private Long memSiteAccountId;
    
	public String getContainer() {
		return container;
	}
	public void setContainer(String container) {
		this.container = container;
	}
	public Long getMemItemAccountId() {
		return memItemAccountId;
	}
	public void setMemItemAccountId(Long memItemAccountId) {
		this.memItemAccountId = memItemAccountId;
	}
	public Long getMemItemId() {
		return memItemId;
	}
	public void setMemItemId(Long memItemId) {
		this.memItemId = memItemId;
	}
	public Long getMemSiteAccountId() {
		return memSiteAccountId;
	}
	public void setMemSiteAccountId(Long memSiteAccountId) {
		this.memSiteAccountId = memSiteAccountId;
	}

}
