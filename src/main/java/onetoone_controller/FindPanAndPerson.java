package onetoone_controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import onetoone_dto.Pan;
import onetoone_dto.Person;

public class FindPanAndPerson {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();

		Pan p = em.find(Pan.class, 2);
		Person pa = p.getP();

		System.out.println(p.getCountry());
		System.out.println(p.getPanNo());

	}

}
