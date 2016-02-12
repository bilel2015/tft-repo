package edu.esprit.persistance;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class GamePK  implements Serializable{
	
	private Integer idPlayer;
	private Integer idMatch;
	
	public GamePK() {
		super();

	}
	public Integer getIdPlayer() {
		return idPlayer;
	}
	public void setIdPlayer(Integer idPlayer) {
		this.idPlayer = idPlayer;
	}
	public Integer getIdMatch() {
		return idMatch;
	}
	public void setIdMatch(Integer idMatch) {
		this.idMatch = idMatch;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMatch == null) ? 0 : idMatch.hashCode());
		result = prime * result + ((idPlayer == null) ? 0 : idPlayer.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GamePK other = (GamePK) obj;
		if (idMatch == null) {
			if (other.idMatch != null)
				return false;
		} else if (!idMatch.equals(other.idMatch))
			return false;
		if (idPlayer == null) {
			if (other.idPlayer != null)
				return false;
		} else if (!idPlayer.equals(other.idPlayer))
			return false;
		return true;
	}
	
	

}
