package edu.esprit.service;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.esprit.persistance.Admin;

/**
 * Session Bean implementation class AdminService
 */
@Stateless
@LocalBean
public class AdminService implements AdminServiceRemote, AdminServiceLocal {

    /**
     * Default constructor. 
     */

	
    public AdminService() {
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext
	EntityManager em;
    
	@Override
	public Boolean saveAdmin(Admin a) {
		try{
			em.persist(a);
			return true;
			}catch(Exception e)
			{
				return false;
			}
	}

	@Override
	public Admin addAdmin(Admin a) {
		em.persist(a);
		return a;
	}

	@Override
	/////////////////////////////

	public Admin authentificate(String login, String pwd) {
	
		Query query= em.createQuery("select p from Admin p where p.login=:l and p.pwd=:pw");
		query.setParameter("l",login).setParameter("pw",pwd);
		
		Admin admin=null;
	try{
		admin= (Admin) query.getSingleResult();
		System.out.println("admin " + admin.getLogin());
		
	}
	catch(Exception e){
	return null;		
	
	}
		return admin;
	}
	/////////////////////////////////
/*	public Admin authentificate(String login, String pwd) {
		
		Admin found = null;

		String jpql = "select p from admin p where p.login=:l and p.pwd=:pw";
		javax.persistence.TypedQuery<Admin> query = em.createQuery(jpql, Admin.class);
		query.setParameter("l", login);
		query.setParameter("pw", pwd);
		
		try {
			found = query.getSingleResult();
		} catch (NoResultException e) {

			return null;
		}

		return (Admin)found;
	}*/
}
