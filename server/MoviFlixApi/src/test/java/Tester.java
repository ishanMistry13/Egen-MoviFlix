import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.egen.MoviFlixApi.Entities.User;

public class Tester {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MoviFlix-Jpa");

		EntityManager em = emf.createEntityManager();

		User us;

		// UUID.randomUUID().toString();

		/*
		 * // INSERT RECORD us.setEmailId("ishanmistry13@gmail.com");
		 * us.setFirstName("Ishan"); us.setLastName("Mistry");
		 * us.setUsrPwd("admin");
		 * 
		 * 
		 * em.getTransaction().begin(); em.persist(us);
		 * em.getTransaction().commit();
		 */

		us = em.find(User.class, "ishanmistry13@gmail.com");
		
		us.setFirstName("Dhruv");
		us.setLastName("Mistry");//This value will not be set as it was already same in the record

		//UPDATE RECORD USING MERGE
		em.getTransaction().begin();
		em.merge(us);
		em.getTransaction().commit();

		// For delete
		/*
		 * em.getTransaction().begin(); em.remove(us);
		 * 
		 * em.getTransaction().commit();
		 */

		// FIND ALL
		// Select * from User
		// em.createQuery("");

		em.close();

		emf.close();
	}

}
