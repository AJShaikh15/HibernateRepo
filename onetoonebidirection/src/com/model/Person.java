package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int pid;
	private String pname;
	public PanCard getPan() {
		return pan;
	}
	public void setPan(PanCard pan) {
		this.pan = pan;
	}
	private String paddr;
	@OneToOne(cascade = CascadeType.ALL)
	private PanCard pan;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddr() {
		return paddr;
	}
	public void setPaddr(String paddr) {
		this.paddr = paddr;
	}
}
