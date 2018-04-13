package com.github.paolodenti.telegram.webhook.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MaskPosition {

	@JsonProperty("point")
	private String point;

	@JsonProperty("x_shift")
	private Double xShift;

	@JsonProperty("y_shift")
	private Double yShift;

	@JsonProperty("scale")
	private Double scale;

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public Double getxShift() {
		return xShift;
	}

	public void setxShift(Double xShift) {
		this.xShift = xShift;
	}

	public Double getyShift() {
		return yShift;
	}

	public void setyShift(Double yShift) {
		this.yShift = yShift;
	}

	public Double getScale() {
		return scale;
	}

	public void setScale(Double scale) {
		this.scale = scale;
	}

	@Override
	public String toString() {
		return "MaskPosition [point=" + point + ", xShift=" + xShift + ", yShift=" + yShift + ", scale=" + scale + "]";
	}
}
