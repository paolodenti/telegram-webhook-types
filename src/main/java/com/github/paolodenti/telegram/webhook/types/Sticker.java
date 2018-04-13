package com.github.paolodenti.telegram.webhook.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sticker {
	@JsonProperty("file_id")
	private String fileId;

	@JsonProperty("width")
	private Integer width;

	@JsonProperty("height")
	private Integer height;

	@JsonProperty("thumb")
	private PhotoSize thumb;

	@JsonProperty("emoji")
	private String emoji;

	@JsonProperty("set_name")
	private String setName;

	@JsonProperty("mask_position")
	private MaskPosition maskPosition;

	@JsonProperty("file_size")
	private Integer fileSize;

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public PhotoSize getThumb() {
		return thumb;
	}

	public void setThumb(PhotoSize thumb) {
		this.thumb = thumb;
	}

	public String getEmoji() {
		return emoji;
	}

	public void setEmoji(String emoji) {
		this.emoji = emoji;
	}

	public String getSetName() {
		return setName;
	}

	public void setSetName(String setName) {
		this.setName = setName;
	}

	public MaskPosition getMaskPosition() {
		return maskPosition;
	}

	public void setMaskPosition(MaskPosition maskPosition) {
		this.maskPosition = maskPosition;
	}

	public Integer getFileSize() {
		return fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public String toString() {
		return "Sticker [fileId=" + fileId + ", width=" + width + ", height=" + height + ", thumb=" + thumb + ", emoji=" + emoji + ", setName=" + setName + ", maskPosition=" + maskPosition + ", fileSize=" + fileSize + "]";
	}
}
