package com.github.paolodenti.telegram.webhook.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Video {
	@JsonProperty("file_id")
	private String fileId;

	@JsonProperty("width")
	private Integer width;

	@JsonProperty("height")
	private Integer height;

	@JsonProperty("duration")
	private Integer duration;

	@JsonProperty("thumb")
	private PhotoSize thumb;

	@JsonProperty("mime_type")
	private String mimeType;

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

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public PhotoSize getThumb() {
		return thumb;
	}

	public void setThumb(PhotoSize thumb) {
		this.thumb = thumb;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public Integer getFileSize() {
		return fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public String toString() {
		return "Video [fileId=" + fileId + ", width=" + width + ", height=" + height + ", duration=" + duration + ", thumb=" + thumb + ", mimeType=" + mimeType + ", fileSize=" + fileSize + "]";
	}
}
