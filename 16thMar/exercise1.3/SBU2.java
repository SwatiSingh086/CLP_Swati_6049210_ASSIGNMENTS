package cg.demo.springg.beans;

import java.util.List;

public class SBU2 {
	private String sbuCode;
	private String sbuName;
	private String sbuHead;
	
	private List<Employee3> empList;
	public SBU2(String sbuCode, String sbuName, String sbuHead, List<Employee3> empList) {
		
		this.sbuCode = sbuCode;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
		this.empList = empList;
	}
	public String getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<Employee3> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee3> empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		return "SBU [sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", empList=" + empList
				+ "]";
	}	
}
