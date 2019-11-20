package com.revature.model;

public enum ReimbursementStatus {
	
	PENDING("Pending"),
	APPROVED("Approved"),
	REJECTED("Rejected");

	private String displayName;
	
	ReimbursementStatus(String displayName) {
		this.displayName = displayName;
	}
	
	public String getDisplayName() {
		return displayName;
	}
	
}
