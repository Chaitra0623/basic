package com.xworkz.hospital.tester;

import java.util.List;

import com.xworkz.hospital.dao.HospitalDAO;
import com.xworkz.hospital.dao.HospitalDAOImpl;
import com.xworkz.hospital.dto.HospitalDTO;

public class Tester {
	public static void main(String[] args) {
		try {
			System.out.println("main method started ");
			HospitalDTO dto = new HospitalDTO();
//			dto.setH_id(1);
			dto.setName("chaluvambha");
			dto.setNoOfRooms(590);
			dto.setNoOfEmployee(780);
			dto.setNoOfpatient(600);
			HospitalDAO dao = new HospitalDAOImpl();
			 //dao.save(dto);
			 List<HospitalDTO> value=dao.feachById(2);
			 System.out.println("Value is "+value);

			//dao.upDate("any", 1);
		 //System.out.println("Updated Successfully");

			// dao.delete(1);
			//System.out.println("Succesfully Deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main method ended");

	}

	}


