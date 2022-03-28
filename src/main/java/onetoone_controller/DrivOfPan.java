package onetoone_controller;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone_dto.Pan;
import onetoone_dto.Person;

public class DrivOfPan {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Pan p = new Pan();

		p.setPanNo("INMH78876");
		p.setDate(LocalDateTime.now());
		p.setCountry("India");
		

		Person r = new Person();
		r.setName("KRISHNA");
		r.setCno(987456);
		r.setGender("Male");
		p.setP(r);

		et.begin();
		em.persist(r);
		em.persist(p);
		et.commit();
	}

}
