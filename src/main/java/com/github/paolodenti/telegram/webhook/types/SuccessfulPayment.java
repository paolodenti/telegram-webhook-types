package com.github.paolodenti.telegram.webhook.types;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class SuccessfulPayment {
	private String currency;

	private Integer totalAmount;

	private String invoicePayload;

	private String shippingOptionId;

	private OrderInfo orderInfo;

	private String telegramPaymentChargeId;

	private String providerPaymentChargeId;

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

	public String getTelegramPaymentChargeId() {
		return telegramPaymentChargeId;
	}

	public void setTelegramPaymentChargeId(String telegramPaymentChargeId) {
		this.telegramPaymentChargeId = telegramPaymentChargeId;
	}

	public String getProviderPaymentChargeId() {
		return providerPaymentChargeId;
	}

	public void setProviderPaymentChargeId(String providerPaymentChargeId) {
		this.providerPaymentChargeId = providerPaymentChargeId;
	}

	@Override
	public String toString() {
		return "SuccessfulPayment [currency=" + currency + ", totalAmount=" + totalAmount + ", invoicePayload=" + invoicePayload + ", shippingOptionId=" + shippingOptionId + ", orderInfo=" + orderInfo + ", telegramPaymentChargeId=" + telegramPaymentChargeId + ", providerPaymentChargeId=" + providerPaymentChargeId + "]";
	}
}
