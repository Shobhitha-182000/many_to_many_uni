package many_to_many_person_controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many_person_dto.Language;
import many_to_many_person_dto.Person;

public class PersonLAnguageMAin {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Language l1=new Language();
		l1.setId(1);
		l1.setName("kannada");
		l1.setOrigin("karnataka");
		l1.setCountry("India");
		
		Language l2=new Language();
		l2.setId(2);
		l2.setName("Telugu");
		l2.setOrigin(" Andra");
		l2.setCountry("India");
		
		Language l3=new Language();
		l3.setId(3);
		l3.setName(" Tamil");
		l3.setOrigin("chenai");
		l3.setCountry("India");
		
		Person p1=new Person();
		p1.setId(101);
		p1.setName("raju");
		p1.setPhone(683264);
		p1.setAddress("BLR");
		
		Person p2=new Person();
		p2.setId(102);
		p2.setName("saraju");
		p2.setPhone(683264);
		p2.setAddress("Mysore");
		
		Person p3=new Person();
		p3.setId(103);
		p3.setName("Ram");
		p3.setPhone(3725798347l);
		p3.setAddress("HSn");
		
		List<Language> list1=new ArrayList<Language>();
		list1.add(l1);
		list1.add(l2);
		
		List<Language> list2=new ArrayList<Language>();
		list2.add(l3);
		list2.add(l2);
		
		p1.setLanguage(list1);
		p2.setLanguage(list2);
		p3.setLanguage(list1);
		
		entityTransaction.begin();
		
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		entityManager.persist(l1);
		entityManager.persist(l2);
		entityManager.persist(l3);
		
		entityTransaction.commit();
		
		
	}
}
