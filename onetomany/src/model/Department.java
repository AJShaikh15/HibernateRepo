package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	private int did;
	private String dname;
	private String daddr;
	
	@OneToMany(cascade = CascadeType.ALL)
	Set<Employee> e=new HashSet<Employee>();
	public int getDid() {
		return did;
	}
	public Set<Employee> getE() {
		return e;
	}
	public void setE(Set<Employee> e) {
		this.e = e;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDaddr() {
		return daddr;
	}
	public void setDaddr(String daddr) {
		this.daddr = daddr;
	}
}
