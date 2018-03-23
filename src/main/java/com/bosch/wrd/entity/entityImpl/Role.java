package com.bosch.wrd.entity.entityImpl;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PreRemove;
import javax.persistence.Table;

import com.bosch.wrd.entity.BaseEntity;

@Entity
@Table(name = "role")
public class Role extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "code")
	private String code;

	@Column(name = "label")
	private String label;

	@ManyToMany(mappedBy = "roles")
	private Set<User> users = new HashSet<User>(0);

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "roles_permissions", joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "permission_id", referencedColumnName = "id"))
	private Set<Permission> permissions = new HashSet<Permission>(0);

	public Role() {
	}

	public Role(Long id, String code, String label) {
		super(id);
		this.code = code;
		this.label = label;
	}

	public String getCode() {
		return code;
	}

	@PreRemove
	private void removeGroupFromRole() {
		users.forEach(u -> {
			u.getRoles().remove(this);
		});

		permissions.forEach(p -> {
			p.getRoles().remove(this);
		});

	}

	public String getLabel() {
		return label;
	}

	public Set<User> getUsers() {
		return users;
	}

	public Set<Permission> getPermissions() {
		return permissions;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public void setPermissions(Set<Permission> permissions) {
		this.permissions = permissions;
	}

}
