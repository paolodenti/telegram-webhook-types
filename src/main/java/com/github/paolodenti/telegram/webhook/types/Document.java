package com.github.paolodenti.telegram.webhook.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Document {
	@JsonProperty("file_id")
	private String fileId;

	@JsonProperty("thumb")
	private PhotoSize thumb;

	@JsonProperty("file_name")
	private String fileName;

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

	public PhotoSize getThumb() {
		return thumb;
	}

	public void setThumb(PhotoSize thumb) {
		this.thumb = thumb;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
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
		return "Document [fileId=" + fileId + ", thumb=" + thumb + ", fileName=" + fileName + ", mimeType=" + mimeType + ", fileSize=" + fileSize + "]";
	}
}
