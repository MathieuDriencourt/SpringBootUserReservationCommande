package fr.formation.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class ReservationSoir {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idReservationSoir;
	@Temporal(TemporalType.DATE)
	private Date dateReservationSoir;
	private int nbPersonnnesReservationSoir;
	
	@ManyToOne
	private User client;

	public ReservationSoir() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReservationSoir(Date dateReservationSoir, int nbPersonnnesReservationSoir, User client) {
		super();
		this.dateReservationSoir = dateReservationSoir;
		this.nbPersonnnesReservationSoir = nbPersonnnesReservationSoir;
		this.client = client;
	}

	@Override
	public String toString() {
		return "ReservationSoir [idReservationSoir=" + idReservationSoir + ", dateReservationSoir="
				+ dateReservationSoir + ", nbPersonnnesReservationSoir=" + nbPersonnnesReservationSoir + ", client="
				+ client + "]";
	}

	public long getIdReservationSoir() {
		return idReservationSoir;
	}

	public void setIdReservationSoir(long idReservationSoir) {
		this.idReservationSoir = idReservationSoir;
	}

	public Date getDateReservationSoir() {
		return dateReservationSoir;
	}

	public void setDateReservationSoir(Date dateReservationSoir) {
		this.dateReservationSoir = dateReservationSoir;
	}

	public int getNbPersonnnesReservationSoir() {
		return nbPersonnnesReservationSoir;
	}

	public void setNbPersonnnesReservationSoir(int nbPersonnnesReservationSoir) {
		this.nbPersonnnesReservationSoir = nbPersonnnesReservationSoir;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	
	

}
