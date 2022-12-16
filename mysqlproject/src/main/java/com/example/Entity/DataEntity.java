package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DataEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private int age;
	public int enrollmentNo;
	public String fatherName;
	public long mobileNo;
	public String address;

	public DataEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEnrollmentNo() {
		return enrollmentNo;
	}

	public void setEnrollmentNo(int enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "DataEntity [id=" + id + ", name=" + name + ", age=" + age + ", enrollmentNo=" + enrollmentNo
				+ ", fatherName=" + fatherName + ", mobileNo=" + mobileNo + ", address=" + address + "]";
	}

}
