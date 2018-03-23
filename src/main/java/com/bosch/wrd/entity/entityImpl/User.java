package com.bosch.wrd.entity.entityImpl;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.bosch.wrd.entity.StringEntity;

@Entity
@Table(name = "user")
public class User extends StringEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "name")
	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "credentials_expired_date")
	private Date credentialsExpiredDate;

	@Column(name = "enabled")
	private boolean enabled;

	@Column(name = "password")
	private String password;

	@Column(name = "email")
	private String email;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_created")
	private Date created;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
	private Set<Role> roles = new HashSet<Role>(0);

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Releases> releases = new HashSet<Releases>(0);

	public User() {
	}

	public User(Set<Role> roles) {
		super();
		this.roles = roles;
	}

	public User(Date created, Date credentialsExpiredDate, boolean enabled, String id, String name, String password,
			String email) {
		this.name = name;
		this.credentialsExpiredDate = credentialsExpiredDate;
		this.enabled = enabled;
		this.password = password;
		this.email = email;
		this.created = created;
	}

	public String getName() {
		return name;
	}

	public Date getCredentialsExpiredDate() {
		return credentialsExpiredDate;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public Date getCreated() {
		return created;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public Set<Releases> getReleases() {
		return releases;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCredentialsExpiredDate(Date credentialsExpiredDate) {
		this.credentialsExpiredDate = credentialsExpiredDate;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public void setReleases(Set<Releases> releases) {
		this.releases = releases;
	}

}
