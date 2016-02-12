package edu.esprit.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.esprit.persistance.Player;

/**
 * Session Bean implementation class MangePlayer
 */
@Stateless
public class MangePlayer implements MangePlayerRemote, MangePlayerLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager entityManager;
    public MangePlayer() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public boolean addPlayer(Player player){
    	try {
    		entityManager.persist(player);
    		return true;
    	}catch (Exception e){
		return false;
    	}
    	 
    }
    	@Override
    	public boolean deletePlayer(Player player){
    		try{
    			entityManager.remove(entityManager.merge(player));
    		return true;	
    		}
    		catch (Exception e){
    			return false;
    		}
    	}
    	@Override
    	public Player findPlayerById(int idUser) {
    		return entityManager.find(Player.class, idUser);
    	} 
    	
    	@Override
    	public List<Player> findAllPlayer() {
    		try {
    			Query query=entityManager.createQuery("select c from Club c");
    			return query.getResultList();
    		} catch (Exception e) {
    			return null;
    		}
    	}
    		@Override
    		public boolean updatePlayer(Player player) {
    			try {
    				entityManager.merge(player);
    				return true;
    			} catch (Exception e) {
    				System.out.println(e);
    				return false;
    			}

    
    
}
}
