package com.github.paolodenti.telegram.webhook.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Invoice {
	@JsonProperty("title")
	private String title;

	@JsonProperty("description")
	private String description;

	@JsonProperty("start_parameter")
	private String startParameter;

	@JsonProperty("currency")
	private String currency;

	@JsonProperty("total_amount")
	private Integer totalAmount;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartParameter() {
		return startParameter;
	}

	public void setStartParameter(String startParameter) {
		this.startParameter = startParameter;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Invoice [title=" + title + ", description=" + description + ", startParameter=" + startParameter + ", currency=" + currency + ", totalAmount=" + totalAmount + "]";
	}
}
