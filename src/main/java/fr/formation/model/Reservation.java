package fr.formation.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reservation {

	@Id
	@GeneratedValue
	private long idReservation;
	@Temporal(TemporalType.DATE)
	private Date dateReservation;
	private int heureReservation;
	private int nbPersonnnesReservation;
	
	
	@ManyToOne
	private User client;


	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Reservation(Date dateReservation, int heureReservation, int nbPersonnnesReservation, User client) {
		super();
		this.dateReservation = dateReservation;
		this.heureReservation = heureReservation;
		this.nbPersonnnesReservation = nbPersonnnesReservation;
		this.client = client;
	}


	public long getIdReservation() {
		return idReservation;
	}


	public void setIdReservation(long idReservation) {
		this.idReservation = idReservation;
	}


	public Date getDateReservation() {
		return dateReservation;
	}


	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}


	public int getHeureReservation() {
		return heureReservation;
	}


	public void setHeureReservation(int heureReservation) {
		this.heureReservation = heureReservation;
	}


	public int getNbPersonnnesReservation() {
		return nbPersonnnesReservation;
	}


	public void setNbPersonnnesReservation(int nbPersonnnesReservation) {
		this.nbPersonnnesReservation = nbPersonnnesReservation;
	}


	public User getClient() {
		return client;
	}


	public void setClient(User client) {
		this.client = client;
	}


	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", dateReservation=" + dateReservation
				+ ", heureReservation=" + heureReservation + ", nbPersonnnesReservation=" + nbPersonnnesReservation
				+ ", client=" + client + "]";
	}
	
	
	
}
