package com.bosch.wrd.entity.entityImpl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bosch.wrd.entity.BaseEntity;

@Entity
@Table(name = "row_formatting")
public class RowFormatting extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "run_pos")
	private Integer runPos;
	
	@Column(name = "run_len")
	private Integer runLen;
	
	@Column(name = "font_index")
	private Integer fontIndex;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "releases_id")
	private Releases releases;
	
	public RowFormatting() {
	}

	public RowFormatting(Long id, Integer runPos, Integer runLen, Integer fontIndex) {
		super(id);
		this.runPos = runPos;
		this.runLen = runLen;
		this.fontIndex = fontIndex;
	}

	public Integer getRunPos() {
		return runPos;
	}

	public Integer getRunLen() {
		return runLen;
	}

	public Integer getFontIndex() {
		return fontIndex;
	}

	public Releases getReleases() {
		return releases;
	}

	public void setRunPos(Integer runPos) {
		this.runPos = runPos;
	}

	public void setRunLen(Integer runLen) {
		this.runLen = runLen;
	}

	public void setFontIndex(Integer fontIndex) {
		this.fontIndex = fontIndex;
	}

	public void setReleases(Releases releases) {
		this.releases = releases;
	}
}
