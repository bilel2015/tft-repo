package edu.esprit.persistance;

import edu.esprit.persistance.User;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: AntidopingResp
 *
 */
@Entity
@Table(name="AntidopingResp")

public class AntidopingResp extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public AntidopingResp() {
		super();
	}
   
}
