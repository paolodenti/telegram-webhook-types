package com.github.paolodenti.telegram.webhook.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Voice {
	@JsonProperty("file_id")
	private String fileId;

	@JsonProperty("duration")
	private Integer duration;

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

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
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
		return "Voice [fileId=" + fileId + ", duration=" + duration + ", mimeType=" + mimeType + ", fileSize=" + fileSize + "]";
	}
}
