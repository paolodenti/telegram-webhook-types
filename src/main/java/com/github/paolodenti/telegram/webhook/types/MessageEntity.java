package com.github.paolodenti.telegram.webhook.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageEntity {
	@JsonProperty("type")
	private String type;

	@JsonProperty("offset")
	private Integer offset;

	@JsonProperty("length")
	private Integer length;

	@JsonProperty("url")
	private String url;

	@JsonProperty("user")
	private User user;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "MessageEntity [type=" + type + ", offset=" + offset + ", length=" + length + ", url=" + url + ", user=" + user + "]";
	}
}
