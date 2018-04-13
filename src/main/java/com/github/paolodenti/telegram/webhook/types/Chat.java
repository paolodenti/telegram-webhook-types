package com.github.paolodenti.telegram.webhook.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Chat {
	@JsonProperty("id")
	private Integer id;

	@JsonProperty("type")
	private String type;

	@JsonProperty("title")
	private String title;

	@JsonProperty("username")
	private String username;

	@JsonProperty("first_name")
	private String firstName;

	@JsonProperty("last_name")
	private String lastName;

	@JsonProperty("all_members_are_administrators")
	private Boolean allMembersAreAdministrators;

	@JsonProperty("photo")
	private ChatPhoto photo;

	@JsonProperty("description")
	private String description;

	@JsonProperty("invite_link")
	private String inviteLink;

	@JsonProperty("pinned_message")
	private String pinnedMessage;

	@JsonProperty("sticker_set_name")
	private String stickerSetName;

	@JsonProperty("can_set_sticker_set")
	private Boolean canSetStickerSet;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Boolean getAllMembersAreAdministrators() {
		return allMembersAreAdministrators;
	}

	public void setAllMembersAreAdministrators(Boolean allMembersAreAdministrators) {
		this.allMembersAreAdministrators = allMembersAreAdministrators;
	}

	public ChatPhoto getPhoto() {
		return photo;
	}

	public void setPhoto(ChatPhoto photo) {
		this.photo = photo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInviteLink() {
		return inviteLink;
	}

	public void setInviteLink(String inviteLink) {
		this.inviteLink = inviteLink;
	}

	public String getPinnedMessage() {
		return pinnedMessage;
	}

	public void setPinnedMessage(String pinnedMessage) {
		this.pinnedMessage = pinnedMessage;
	}

	public String getStickerSetName() {
		return stickerSetName;
	}

	public void setStickerSetName(String stickerSetName) {
		this.stickerSetName = stickerSetName;
	}

	public Boolean getCanSetStickerSet() {
		return canSetStickerSet;
	}

	public void setCanSetStickerSet(Boolean canSetStickerSet) {
		this.canSetStickerSet = canSetStickerSet;
	}

	@Override
	public String toString() {
		return "Chat [id=" + id + ", type=" + type + ", title=" + title + ", username=" + username + ", firstName=" + firstName + ", lastName=" + lastName + ", allMembersAreAdministrators=" + allMembersAreAdministrators + ", photo=" + photo + ", description=" + description + ", inviteLink=" + inviteLink + ", pinnedMessage=" + pinnedMessage + ", stickerSetName=" + stickerSetName + ", canSetStickerSet=" + canSetStickerSet + "]";
	}
}