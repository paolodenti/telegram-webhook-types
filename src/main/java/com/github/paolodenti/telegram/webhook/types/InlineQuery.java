package com.github.paolodenti.telegram.webhook.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InlineQuery {
	@JsonProperty("id")
	private String id;

	@JsonProperty("from")
	private User from;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("query")
	private String query;

	@JsonProperty("offset")
	private String offset;

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

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	@Override
	public String toString() {
		return "InlineQuery [id=" + id + ", from=" + from + ", location=" + location + ", query=" + query + ", offset=" + offset + "]";
	}
}
