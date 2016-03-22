package com.tabla.usuarios;

public class Persona2 {

	private long userId;
	private String screenName;
	
	public Persona2(long userId, String screenName) {
		super();
		this.userId = userId;
		this.screenName = screenName;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	@Override
	public String toString() {
		return "Persona2 [userId=" + userId + ", screenName=" + screenName + "]";
	}

	
}
	
