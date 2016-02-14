package edu.esprit.persistance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ReservationPK implements Serializable {

	private Integer idFan;
	private Integer idMatch;

	public ReservationPK() {
		super();
	}

	@Column(name = "idFan")
	public Integer getIdPlayer() {
		return idFan;
	}

	public void setIdPlayer(Integer idPlayer) {
		this.idFan = idFan;
	}

	@Column(name = "idMatch")
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
		result = prime * result + ((idFan == null) ? 0 : idFan.hashCode());
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
		ReservationPK other = (ReservationPK) obj;
		if (idMatch == null) {
			if (other.idMatch != null)
				return false;
		} else if (!idMatch.equals(other.idMatch))
			return false;
		if (idFan == null) {
			if (other.idFan != null)
				return false;
		} else if (!idFan.equals(other.idFan))
			return false;
		return true;
	}

	public ReservationPK(Integer idFan, Integer idMatch) {
		super();
		this.idFan = idFan;
		this.idMatch = idMatch;
	}

}
