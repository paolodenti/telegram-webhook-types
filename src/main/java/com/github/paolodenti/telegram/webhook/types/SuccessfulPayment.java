package com.github.paolodenti.telegram.webhook.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SuccessfulPayment {
	@JsonProperty("currency")
	private String currency;

	@JsonProperty("total_amount")
	private Integer totalAmount;

	@JsonProperty("invoice_payload")
	private String invoicePayload;

	@JsonProperty("shipping_option_id")
	private String shippingOptionId;

	@JsonProperty("order_info")
	private OrderInfo orderInfo;

	@JsonProperty("telegram_payment_charge_id")
	private String telegramPaymentChargeId;

	@JsonProperty("provider_payment_charge_id")
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
