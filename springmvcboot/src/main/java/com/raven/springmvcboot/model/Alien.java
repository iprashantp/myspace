package com.raven.springmvcboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
	@Id
	private int aid;
	private String aname;
	public Alien() {}
	public Alien(Integer aid, String name) {
		this.aid = aid;
		this.aname=name;
	}
	
	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String name) {
		this.aname = name;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}
	

}
