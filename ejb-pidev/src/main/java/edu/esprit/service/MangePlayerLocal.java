package edu.esprit.service;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.persistance.Player;

@Local
public interface MangePlayerLocal {

	public boolean addPlayer(Player player);
	public boolean deletePlayer(Player player);
	public Player findPlayerById(int idUser);
	
	public List<Player> findAllPlayer();
	boolean updatePlayer(Player player);

}
