package edu.esprit.persistance;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Club
 *
 */
@Entity
@Table(name = "Club")

public class Club implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idclub;
	private String Name;
	private String NumberPlayer;
	private String yearfounded;
	private String address;

	public String getYearfounded() {
		return yearfounded;
	}

	public void setYearfounded(String yearfounded) {
		this.yearfounded = yearfounded;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

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

	public Club(Integer idclub, String name, String numberPlayer, String yearfounded, String address, Player player) {
		super();
		this.idclub = idclub;
		Name = name;
		NumberPlayer = numberPlayer;
		this.yearfounded = yearfounded;
		this.address = address;
		this.player = player;
	}

}
