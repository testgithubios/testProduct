/**
 * 
 */
package com.bosch.wrd.dto;

/**
 * @author hnd1hc
 *
 */
public class UserDto {

	private String id;
	private String name;
	private String credentialsExpiredDate;
	private boolean enabled;
	private String password;
	private String email;
	private String created;
	private String roleDtos;

	public UserDto() {
		super();
	}

	public UserDto(String roleDtos) {
		super();
		this.roleDtos = roleDtos;
	}

	public UserDto(String created, String credentialsExpiredDate, boolean enabled, String id, String name,
			String password, String email) {
		this.id = id;
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

	public void setName(String name) {
		this.name = name;
	}

	public String getCredentialsExpiredDate() {
		return credentialsExpiredDate;
	}

	public void setCredentialsExpiredDate(String credentialsExpiredDate) {
		this.credentialsExpiredDate = credentialsExpiredDate;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleDtos() {
		return roleDtos;
	}

	public void setRoleDtos(String roleDtos) {
		this.roleDtos = roleDtos;
	}

}
