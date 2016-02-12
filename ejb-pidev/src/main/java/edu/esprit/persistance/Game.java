package edu.esprit.persistance;

import edu.esprit.persistance.GamePK;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Game
 *
 */
@Entity
public class Game implements Serializable {

	
	private Date dateGame;
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private GamePK gamePK;
	

	public Game() {
		super();
	}   
	
	
	public GamePK getGamePK() {
		return this.gamePK;
	}

	public void setGamePK(GamePK gamePK) {
		this.gamePK = gamePK;
	}   
	public Date getDateGame() {
		return this.dateGame;
	}

	public void setDateGame(Date dateGame) {
		this.dateGame = dateGame;
	}
   
}
