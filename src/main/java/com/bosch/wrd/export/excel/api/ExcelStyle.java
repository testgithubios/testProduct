package com.bosch.wrd.export.excel.api;

import org.apache.poi.ss.usermodel.FillPatternType;

public class ExcelStyle {

	private short color;
	private FillPatternType fillPattern;
	private boolean wrapText;
	private String fontName;
	private short fontHeight;
	
	public ExcelStyle(short color, FillPatternType fillPattern, boolean wrapText, String fontName, short fontHeight) {
		this.color = color;
		this.fillPattern = fillPattern;
		this.wrapText = wrapText;
		this.fontName = fontName;
		this.fontHeight = fontHeight;
	}

	public short getColor() {
		return color;
	}

	public FillPatternType getFillPattern() {
		return fillPattern;
	}

	public boolean isWrapText() {
		return wrapText;
	}

	public String getFontName() {
		return fontName;
	}

	public short getFontHeight() {
		return fontHeight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + color;
		result = prime * result + ((fillPattern == null) ? 0 : fillPattern.hashCode());
		result = prime * result + fontHeight;
		result = prime * result + ((fontName == null) ? 0 : fontName.hashCode());
		result = prime * result + (wrapText ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExcelStyle other = (ExcelStyle) obj;
		if (color != other.color)
			return false;
		if (fillPattern != other.fillPattern)
			return false;
		if (fontHeight != other.fontHeight)
			return false;
		if (fontName == null) {
			if (other.fontName != null)
				return false;
		} else if (!fontName.equals(other.fontName))
			return false;
		if (wrapText != other.wrapText)
			return false;
		return true;
	}

}
