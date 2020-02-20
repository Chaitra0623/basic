package com.xworkz.hospital.dao;



import java.io.Serializable;
import java.util.List;

import javax.transaction.Synchronization;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import com.xworkz.hospital.dto.HospitalDTO;

public class HospitalDAOImpl implements HospitalDAO {

	@Override
	public void save(HospitalDTO dto) {
		System.out.println("inside save_methode");
		Session session=null;
		SessionFactory factory=null;
		try {
			Configuration cfg=new Configuration();
			cfg.configure("resource/hibernate.xml");
			//cfg.addAnnotatedClass(HospitalDTO.class);
			factory=cfg.buildSessionFactory();
			 session=factory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(dto);
			tx.commit();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(session!=null && factory!=null);
			session.clear();
			factory.close();
			}
		}

	@Override
	public List<HospitalDTO> feachById(int id) {
		System.out.println("inside feachById");
		Session session=null;
		SessionFactory factory=null;
		try {
			Configuration cfg=new  Configuration();
			cfg.configure("resource/hibernate.xml");
			//cfg.addAnnotatedClass(HospitalDTO.class);
			factory=cfg.buildSessionFactory();
			session=factory.openSession();
			Transaction tx=session.beginTransaction();
			// Serializable ser=session.get(HospitalDTO.class, id);
			  //  return (HospitalDTO) ser;
			
			String sql="select * from hospital_table";
			Query query=session.createSQLQuery(sql);
			
			//query.setParameter("id", id);
			Object list=query.list();
			
		}
		catch (Exception e) {
			e.printStackTrace();
			//System.out.println("Exception is"+e.getMessage());
		
		}
		finally {
			if(session!=null &&  factory!=null) {
				session.close();
				factory.close();
			}
		}
	return null;
	}
			
			@Override
	public void upDate(String name, int id) {
		System.out.println("inside update methode");
		Session  session=null;
		SessionFactory factory=null;
		try {
			Configuration cfg=new Configuration();
			cfg.configure("resource/hibernate.xml");
		//	cfg.addAnnotatedClass(HospitalDTO.class);
			factory=cfg.buildSessionFactory();
			session=factory.openSession();
			Transaction tx=session.beginTransaction();
			factory=cfg.buildSessionFactory();
			HospitalDTO entity=session.get(HospitalDTO.class, id);
			if(entity!=null) {
				System.out.println("Fectching id is"+id);
				entity.setName(name);
				session.update(entity);
				tx.commit();
		}
		}
			catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(session!=null && factory!=null);
			session.close();
			factory.close();
			
		}
		
	}

	@Override
	public void delete(int id) {
		System.out.println("inside delete ");
		Session session=null;
		SessionFactory factory=null; 
	try {
		Configuration cfg=new Configuration();
		cfg.configure("resource/hibernate.xml");
		//cfg.addAnnotatedClass(HospitalDTO.class);
		 factory=cfg.buildSessionFactory();
		 session=factory.openSession();
		Transaction tx=session.beginTransaction();
		HospitalDTO entity=session.get(HospitalDTO.class, id);
		if(entity!=null) {
			System.out.println("Fectching id is"+id);
			session.delete(entity);
			tx.commit();
		}
	}
	
	catch (Exception e) {
		e.printStackTrace();
		//System.out.println("Exception is"+e.getMessage());
	
	}
	finally {
		if(session!=null &&  factory!=null) {
			session.close();
			factory.close();
		}
		}
		
	}

}

