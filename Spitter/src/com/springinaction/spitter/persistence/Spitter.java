package com.springinaction.spitter.persistence;

import java.io.Serializable;

public class Spitter implements Serializable {
	
	private static final long serialVersionUID = 8795444185043997082L;
	
	private Long id;
	private String username;
	private String password;
	private String fullName;
	
	public Spitter() {
	}
	
	public Spitter(String username, String password, String fullName) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "Spitter [id=" + id + ", username=" + username + ", password="
				+ password + ", fullName=" + fullName + "]";
	}
	
}
