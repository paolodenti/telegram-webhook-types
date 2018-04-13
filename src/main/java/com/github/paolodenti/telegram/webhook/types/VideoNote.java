package com.github.paolodenti.telegram.webhook.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VideoNote {
	@JsonProperty("file_id")
	private String fileId;

	@JsonProperty("length")
	private Integer length;

	@JsonProperty("duration")
	private Integer duration;

	@JsonProperty("thumb")
	private PhotoSize thumb;

	@JsonProperty("file_size")
	private Integer fileSize;

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
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

	public Integer getFileSize() {
		return fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public String toString() {
		return "VideoNote [fileId=" + fileId + ", length=" + length + ", duration=" + duration + ", thumb=" + thumb + ", fileSize=" + fileSize + "]";
	}
}
