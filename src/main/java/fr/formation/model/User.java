package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue
	private long idUser;
	private String nomUser;
	private String prenomUser;
	private String mailUser;
	
	@OneToOne
	private Role role;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String nomUser, String prenomUser, String mailUser, Role role) {
		super();
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
		this.mailUser = mailUser;
		this.role = role;
	}

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public String getNomUser() {
		return nomUser;
	}

	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}

	public String getPrenomUser() {
		return prenomUser;
	}

	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}

	public String getMailUser() {
		return mailUser;
	}

	public void setMailUser(String mailUser) {
		this.mailUser = mailUser;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nomUser=" + nomUser + ", prenomUser=" + prenomUser + ", mailUser="
				+ mailUser + ", role=" + role + "]";
	}
	
	
}
