package edu.esprit.persistance;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@MappedSuperclass
@Table(name="User")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class User implements Serializable {

	
	private Integer idUser;
	private String Firstname;
	private String Lastname;
	private Date Dateofbirth;
	private Double phone;
	private String email;
	private String login;
	private String pwd;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public Integer getIdUser() {
		return this.idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}   
	public String getFirstname() {
		return this.Firstname;
	}

	public void setFirstname(String Firstname) {
		this.Firstname = Firstname;
	}   
	public String getLastname() {
		return this.Lastname;
	}

	public void setLastname(String Lastname) {
		this.Lastname = Lastname;
	}   
	public Date getDateofbirth() {
		return this.Dateofbirth;
	}

	public void setDateofbirth(Date Dateofbirth) {
		this.Dateofbirth = Dateofbirth;
	}   
	public Double getPhone() {
		return this.phone;
	}

	public void setPhone(Double phone) {
		this.phone = phone;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
   
}
