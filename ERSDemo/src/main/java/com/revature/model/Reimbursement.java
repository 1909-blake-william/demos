package com.revature.model;

import java.sql.Timestamp;

public class Reimbursement {

	private int id;
	private double amount;
	private String description;
	private ReimbursementStatus status;
	private ReimbursementType type;
	private String createdBy;
	private String resolvedBy;
	private Timestamp createdOn;
	private Timestamp resolvedOn;

	public Reimbursement() {
	}
	
	

	public Reimbursement(int id, double amount, String description, int status, int type,
			String createdBy, String resolvedBy, Timestamp createdOn, Timestamp resolvedOn) {
		super();
		this.id = id;
		this.amount = amount;
		this.description = description;
		this.status = ReimbursementStatus.values()[status];
		this.type = ReimbursementType.values()[type];
		this.createdBy = createdBy;
		this.resolvedBy = resolvedBy;
		this.createdOn = createdOn;
		this.resolvedOn = resolvedOn;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ReimbursementStatus getStatus() {
		return status;
	}

	public void setStatus(ReimbursementStatus status) {
		this.status = status;
	}

	public ReimbursementType getType() {
		return type;
	}

	public void setType(ReimbursementType type) {
		this.type = type;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getResolvedBy() {
		return resolvedBy;
	}

	public void setResolvedBy(String resolvedBy) {
		this.resolvedBy = resolvedBy;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Timestamp getResolvedOn() {
		return resolvedOn;
	}

	public void setResolvedOn(Timestamp resolvedOn) {
		this.resolvedOn = resolvedOn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((resolvedBy == null) ? 0 : resolvedBy.hashCode());
		result = prime * result + ((resolvedOn == null) ? 0 : resolvedOn.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimbursement other = (Reimbursement) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (createdOn == null) {
			if (other.createdOn != null)
				return false;
		} else if (!createdOn.equals(other.createdOn))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (resolvedBy == null) {
			if (other.resolvedBy != null)
				return false;
		} else if (!resolvedBy.equals(other.resolvedBy))
			return false;
		if (resolvedOn == null) {
			if (other.resolvedOn != null)
				return false;
		} else if (!resolvedOn.equals(other.resolvedOn))
			return false;
		if (status != other.status)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reimbursement [id=" + id + ", amount=" + amount + ", description=" + description + ", status=" + status
				+ ", type=" + type + ", createdBy=" + createdBy + ", resolvedBy=" + resolvedBy + ", createdOn="
				+ createdOn + ", resolvedOn=" + resolvedOn + "]";
	}

}
