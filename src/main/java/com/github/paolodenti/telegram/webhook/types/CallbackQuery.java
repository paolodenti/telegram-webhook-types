package com.github.paolodenti.telegram.webhook.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CallbackQuery {
	@JsonProperty("id")
	private String id;

	@JsonProperty("from")
	private User from;

	@JsonProperty("message")
	private Message message;

	@JsonProperty("inline_message_id")
	private String inlineMessageId;

	@JsonProperty("chat_instance")
	private String chatInstance;

	@JsonProperty("data")
	private String data;

	@JsonProperty("game_short_name")
	private String gameShortName;

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

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public String getInlineMessageId() {
		return inlineMessageId;
	}

	public void setInlineMessageId(String inlineMessageId) {
		this.inlineMessageId = inlineMessageId;
	}

	public String getChatInstance() {
		return chatInstance;
	}

	public void setChatInstance(String chatInstance) {
		this.chatInstance = chatInstance;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getGameShortName() {
		return gameShortName;
	}

	public void setGameShortName(String gameShortName) {
		this.gameShortName = gameShortName;
	}

	@Override
	public String toString() {
		return "CallbackQuery [id=" + id + ", from=" + from + ", message=" + message + ", inlineMessageId=" + inlineMessageId + ", chatInstance=" + chatInstance + ", data=" + data + ", gameShortName=" + gameShortName + "]";
	}
}
