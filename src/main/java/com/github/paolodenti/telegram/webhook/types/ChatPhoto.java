package com.github.paolodenti.telegram.webhook.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChatPhoto {

	@JsonProperty("small_file_id")
	private String smallFileId;

	@JsonProperty("big_file_id")
	private String bigFileId;

	public String getSmallFileId() {
		return smallFileId;
	}

	public void setSmallFileId(String smallFileId) {
		this.smallFileId = smallFileId;
	}

	public String getBigFileId() {
		return bigFileId;
	}

	public void setBigFileId(String bigFileId) {
		this.bigFileId = bigFileId;
	}

	@Override
	public String toString() {
		return "ChatPhoto [smallFileId=" + smallFileId + ", bigFileId=" + bigFileId + "]";
	}
}
