package com.wrapclass;

public class WrapClass1 {
	
	private int id;
	private String name;
	private String email,dob,doj,address;
	private long pno;
	private char gender;
	private double sal;
	
	public WrapClass1(int id,long pno,String name,String address,String dob,String doj,String email,char gender,double sal)
	{
		this.id=id;
		this.name=name;
		this.pno=pno;
		this.address=address;
		this.dob=dob;
		this.doj=doj;
		this.email=email;
		this.gender=gender;
	}

           public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String string) {
			this.dob = string;
		}

		public String getDoj() {
			return doj;
		}

		public void setDoj(String doj) {
			this.doj = doj;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		public double getSal() {
			return sal;
		}

		public void setSal(double sal) {
			this.sal = sal;
		}

		public long getPno() {
			return pno;
		}

		public void setPno(long pno) 
		{
		this.pno = pno;
}
}