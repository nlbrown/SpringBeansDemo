
package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.CarsDemo;


public class CarsDemoHelper {

	static EntityManagerFactory emfactory
		= Persistence.createEntityManagerFactory("CarsDemo");
	
	public void Insertitem(CarsDemo li) {
		EntityManager em =emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(li);
		em.getTransaction().commit();
		em.close();
	}
	public void Deleteitem(CarsDemo li) {
		EntityManager em =emfactory.createEntityManager();
		List<CarsDemo> list = em.createQuery(
				"select card from CarsDemo card where card.make='"+li.getMake()
				+"' AND card.model='"+li.getModel()+"' AND card.year="+li.getYear(), CarsDemo.class).getResultList();
//		EntityManager em =emfactory.createEntityManager();
		em.getTransaction().begin();
		em.remove(list.get(0));
		em.getTransaction().commit();
		em.close();
	}
	public List<CarsDemo> ViewList() {
		EntityManager em =emfactory.createEntityManager();
	    List<CarsDemo> list = em.createQuery("select card from CarsDemo card", CarsDemo.class).getResultList();
		return list;
	}
}
