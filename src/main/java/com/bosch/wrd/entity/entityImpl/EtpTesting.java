/**
 * 
 */
package com.bosch.wrd.entity.entityImpl;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.bosch.wrd.entity.StringEntity;

@Entity
@Table(name = "etptesting")
public class EtpTesting extends StringEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "value")
	private String value;

	@OneToMany(mappedBy="objEtpTesting", fetch = FetchType.LAZY)
	private Set<Releases> releases = new HashSet<>(0);

	public EtpTesting() {

	}

	public EtpTesting(String id, String value) {
		super(id);
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public Set<Releases> getReleases() {
		return releases;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setReleases(Set<Releases> releases) {
		this.releases = releases;
	}

}
