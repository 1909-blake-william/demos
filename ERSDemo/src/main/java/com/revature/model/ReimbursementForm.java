package com.revature.model;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * @author William Gentry
 */
public class ReimbursementForm {

	private double amount;
	private String createdBy;
	private ReimbursementType type;
	private String description;

	public ReimbursementForm() {}

	public ReimbursementForm(double amount, String createdBy, ReimbursementType type, String description) {
		this.amount = amount;
		this.createdBy = createdBy;
		this.type = type;
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public ReimbursementType getType() {
		return type;
	}

	public void setType(ReimbursementType type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ReimbursementForm that = (ReimbursementForm) o;
		return Double.compare(that.amount, amount) == 0 &&
						Objects.equals(createdBy, that.createdBy) &&
						type == that.type &&
						Objects.equals(description, that.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, createdBy, type, description);
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", ReimbursementForm.class.getSimpleName() + "[", "]")
						.add("amount=" + amount)
						.add("createdBy='" + createdBy + "'")
						.add("type=" + type)
						.add("description='" + description + "'")
						.toString();
	}
}
