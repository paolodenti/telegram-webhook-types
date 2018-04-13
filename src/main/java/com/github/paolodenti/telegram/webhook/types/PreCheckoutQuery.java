package com.github.paolodenti.telegram.webhook.types;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PreCheckoutQuery {
	private String id;

	private User from;

	private String currency;

	private Integer totalAmount;

	private String invoicePayload;

	private String shippingOptionId;

	private OrderInfo orderInfo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
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

	public String getInvoicePayload() {
		return invoicePayload;
	}

	public void setInvoicePayload(String invoicePayload) {
		this.invoicePayload = invoicePayload;
	}

	public String getShippingOptionId() {
		return shippingOptionId;
	}

	public void setShippingOptionId(String shippingOptionId) {
		this.shippingOptionId = shippingOptionId;
	}

	public OrderInfo getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(OrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}

	@Override
	public String toString() {
		return "PreCheckoutQuery [id=" + id + ", from=" + from + ", currency=" + currency + ", totalAmount=" + totalAmount + ", invoicePayload=" + invoicePayload + ", shippingOptionId=" + shippingOptionId + ", orderInfo=" + orderInfo + "]";
	}
}
