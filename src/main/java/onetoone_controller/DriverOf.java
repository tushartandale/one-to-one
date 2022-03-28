package onetoone_controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone_dto.Address;
import onetoone_dto.Branch;

public class DriverOf {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Branch b = new Branch();
		b.setName("qsp");
		b.setCno(987789);

		Address a = new Address();

		a.setArea("btr");
		a.setPin(6545);
		a.setState("ka");

		b.setA(a);
		et.begin();
		em.persist(a);
		
		et.commit();
	}

}
