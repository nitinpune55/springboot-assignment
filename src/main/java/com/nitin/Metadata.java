package com.nitin;

public class Metadata {
	private String name;
	private String version;
	private String description;
	private String lastcommitsha;

	public Metadata() {
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setLastcommitsha(String lastcommitsha) {
		this.lastcommitsha = lastcommitsha;
	}
	
	public String getName() {
		return name;
	}
	
	public String getVersion() {
		return version;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getLastcommitsha() {
		return lastcommitsha;
	}

}