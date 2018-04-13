package com.github.paolodenti.telegram.webhook.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Audio {
	@JsonProperty("file_id")
	private String fileId;

	@JsonProperty("duration")
	private Integer duration;

	@JsonProperty("performer")
	private String performer;

	@JsonProperty("title")
	private String title;

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

	public String getPerformer() {
		return performer;
	}

	public void setPerformer(String performer) {
		this.performer = performer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
		return "Audio [fileId=" + fileId + ", duration=" + duration + ", performer=" + performer + ", title=" + title + ", mimeType=" + mimeType + ", fileSize=" + fileSize + "]";
	}
}
