package com.github.paolodenti.telegram.webhook.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShippingQuery {
	@JsonProperty("id")
	private String id;

	@JsonProperty("from")
	private User from;

	@JsonProperty("invoice_payload")
	private String invoicePayload;

	@JsonProperty("shipping_address")
	private ShippingAddress shippingAddress;

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

	public String getInvoicePayload() {
		return invoicePayload;
	}

	public void setInvoicePayload(String invoicePayload) {
		this.invoicePayload = invoicePayload;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	@Override
	public String toString() {
		return "ShippingQuery [id=" + id + ", from=" + from + ", invoicePayload=" + invoicePayload + ", shippingAddress=" + shippingAddress + "]";
	}
}
