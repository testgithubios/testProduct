package com.bosch.wrd.entity.entityImpl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bosch.wrd.entity.BaseEntity;

@Entity
@Table(name = "highlight")
public class Highlight extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "color")
	private String color;
	
	@Column(name = "column_name")
	private String columnName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "releases_id")
	private Releases releases;
	
	public Highlight() {
	}

	public Highlight(Long id, String color, String columnName) {
		super(id);
		this.color = color;
		this.columnName = columnName;
	}

	public String getColor() {
		return color;
	}

	public String getColumnName() {
		return columnName;
	}

	public Releases getReleases() {
		return releases;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public void setReleases(Releases releases) {
		this.releases = releases;
	}
}
