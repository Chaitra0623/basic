package com.xworkz.hospital.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="Hospital_table")

public class HospitalDTO implements Serializable{
	@Id
	@GenericGenerator(name="any", strategy = "increment")
	@GeneratedValue(generator="any")
	@Column(name="H_id")
	private int H_id;
	@Column(name="H_Name")
	private String  Name;
	@Column(name="H_noOfRooms")
	private  int noOfRooms;
	@Column(name="H_noOfEmployee")
	private int noOfEmployee;
	@Column(name="H_noOfpatient")
	private int noOfpatient;
	
	public HospitalDTO() {
		System.out.println("created"+ this.getClass().getSimpleName());
		}

	public int getH_id() {
		return H_id;
	}

	public void setH_id(int h_id) {
		H_id = h_id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public int getNoOfEmployee() {
		return noOfEmployee;
	}

	public void setNoOfEmployee(int noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}

	public int getNoOfpatient() {
		return noOfpatient;
	}

	public void setNoOfpatient(int noOfpatient) {
		this.noOfpatient = noOfpatient;
	}

	@Override
	public String toString() {
		return "HospitalDTO [H_id=" + H_id + ", Name=" + Name + ", noOfRooms=" + noOfRooms + ", noOfEmployee="
				+ noOfEmployee + ", noOfpatient=" + noOfpatient + "]";
	}
	
	

}
