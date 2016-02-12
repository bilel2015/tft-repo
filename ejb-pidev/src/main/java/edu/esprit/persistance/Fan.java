package edu.esprit.persistance;

import edu.esprit.persistance.User;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Fan
 *
 */
@Entity
@Table(name="Fan")

public class Fan extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Fan() {
		super();
	}
   
}
