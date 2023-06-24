package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Employee {

	@Id
	private int eid;
	
	public Department getD() {
		return d;
	}
	public void setD(Department d) {
		this.d = d;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	private Department d;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	private String ename;
}
