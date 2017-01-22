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
		
		//UUID.randomUUID().toString();
		
		/*us.setEmailId("ishanmistry13@gmailcom");
		us.setFirstName("Ishan");
		us.setLastName("Mistry");
		us.setUsrPwd("admin");*/
		
		/*em.getTransaction().begin();
		//Similiar to insert into query
		em.persist(us);
		
		em.getTransaction().commit();
		*/
		
		us = em.find(User.class, "ishanmistry13@gmailcom");
		
		/*
		 * For update use merge
		em.getTransaction().begin();
		em.merge(us);
		em.getTransaction().commit();*/
		
		//For delete
		em.getTransaction().begin();
		em.remove(us);
		
		em.getTransaction().commit();
		
		
		
		em.close();

		emf.close();
	}

}
