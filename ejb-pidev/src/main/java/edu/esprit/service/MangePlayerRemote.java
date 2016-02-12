package edu.esprit.service;

import javax.ejb.Remote;

import edu.esprit.persistance.Player;

@Remote
public interface MangePlayerRemote {

	public boolean addPlayer(Player player);

}
