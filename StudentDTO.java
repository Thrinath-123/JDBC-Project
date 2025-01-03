package com.student;

public class StudentDTO {
	
	private int sno;
	
	private String sname;
	
	private int sage;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	@Override
	public String toString() {
		return "StudentDTO [sno=" + sno + ", sname=" + sname + ", sage=" + sage + "]";
	}
}