package com.xworkz.hospital.dao;

import java.util.List;

import com.xworkz.hospital.dto.HospitalDTO;

public interface HospitalDAO {
	public void save(HospitalDTO dto);
	public List<HospitalDTO> feachById(int  id);
	public  void  upDate(String name,int id);
	public void delete(int id);

}
