package com.bosch.wrd.entity.entityImpl;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.bosch.wrd.entity.StringEntity;

@Entity
@Table(name = "priority")
public class Priority extends StringEntity {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "name")
	private String name;
	
	@ManyToMany(mappedBy = "priorities")
	private Set<Releases> releases = new HashSet<>(0);
	
	public Priority() {
	}

	public Priority(String id, String name) {
		super(id);
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public Set<Releases> getReleases() {
		return releases;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setReleases(Set<Releases> releases) {
		this.releases = releases;
	}
}
