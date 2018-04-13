package com.github.paolodenti.telegram.webhook.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Venue {
	@JsonProperty("location")
	private Location location;

	@JsonProperty("title")
	private String title;

	@JsonProperty("address")
	private String address;

	@JsonProperty("foursquare_id")
	private String foursquareId;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFoursquareId() {
		return foursquareId;
	}

	public void setFoursquareId(String foursquareId) {
		this.foursquareId = foursquareId;
	}

	@Override
	public String toString() {
		return "Venue [location=" + location + ", title=" + title + ", address=" + address + ", foursquareId=" + foursquareId + "]";
	}
}
