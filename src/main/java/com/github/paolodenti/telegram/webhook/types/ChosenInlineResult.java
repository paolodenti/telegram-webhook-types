package com.github.paolodenti.telegram.webhook.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChosenInlineResult {
	@JsonProperty("result_id")
	private String resultId;

	@JsonProperty("from")
	private User from;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("inline_message_id")
	private String inlineMessageId;

	@JsonProperty("query")
	private String query;

	public String getResultId() {
		return resultId;
	}

	public void setResultId(String resultId) {
		this.resultId = resultId;
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

	public String getInlineMessageId() {
		return inlineMessageId;
	}

	public void setInlineMessageId(String inlineMessageId) {
		this.inlineMessageId = inlineMessageId;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	@Override
	public String toString() {
		return "ChosenInlineResult [resultId=" + resultId + ", from=" + from + ", location=" + location + ", inlineMessageId=" + inlineMessageId + ", query=" + query + "]";
	}
}
