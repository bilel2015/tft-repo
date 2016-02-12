package edu.esprit.persistance;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Club
 *
 */
@Entity
@Table(name="Club")

public class Club implements Serializable {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idclub;
	private String Name;
	private String NumberPlayer;
	private static final long serialVersionUID = 1L;

	public Club() {
		super();
	}   
	
	@ManyToOne	
	private Player player;
	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Integer getIdclub() {
		return this.idclub;
	}

	public void setIdclub(Integer idclub) {
		this.idclub = idclub;
	}   
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}   
	public String getNumberPlayer() {
		return this.NumberPlayer;
	}

	public void setNumberPlayer(String NumberPlayer) {
		this.NumberPlayer = NumberPlayer;
	}

	public Club(String name, String numberPlayer, Player player) {
		super();
		Name = name;
		NumberPlayer = numberPlayer;
		this.player = player;
	}
	
   
}
