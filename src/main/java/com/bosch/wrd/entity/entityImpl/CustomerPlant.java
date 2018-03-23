package com.bosch.wrd.entity.entityImpl;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.bosch.wrd.entity.StringEntity;

@Entity
@Table(name = "customer_plant")
public class CustomerPlant extends StringEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "description")
	private String description;
	
	@ManyToMany(mappedBy = "customerPlants")
	private Set<Releases> releases = new HashSet<>(0);

	public CustomerPlant() {
	}

	public CustomerPlant(String id, String description) {
		super(id);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	public Set<Releases> getReleases() {
		return releases;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setReleases(Set<Releases> releases) {
		this.releases = releases;
	}
}
