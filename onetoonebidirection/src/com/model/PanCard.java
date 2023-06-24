package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PanCard {

	@Id
	private int panno;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Person per;
	public int getPanno() {
		return panno;
	}
	public Person getPer() {
		return per;
	}
	public void setPer(Person per) {
		this.per = per;
	}
	public void setPanno(int panno) {
		this.panno = panno;
	}
	public String getPantype() {
		return pantype;
	}
	public void setPantype(String pantype) {
		this.pantype = pantype;
	}
	private String pantype;
}
