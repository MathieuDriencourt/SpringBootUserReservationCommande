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
public class ReservationMidi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idReservationMidi;
	@Temporal(TemporalType.DATE)
	private Date dateReservationMidi;
	private int nbPersonnnesReservationMidi;
	
	
	@ManyToOne
	private User client;


	public ReservationMidi() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ReservationMidi(Date dateReservationMidi, int nbPersonnnesReservationMidi, User client) {
		super();
		this.dateReservationMidi = dateReservationMidi;
		this.nbPersonnnesReservationMidi = nbPersonnnesReservationMidi;
		this.client = client;
	}


	@Override
	public String toString() {
		return "ReservationMidi [idReservationMidi=" + idReservationMidi + ", dateReservationMidi="
				+ dateReservationMidi + ", nbPersonnnesReservationMidi=" + nbPersonnnesReservationMidi + ", client="
				+ client + "]";
	}


	public long getIdReservationMidi() {
		return idReservationMidi;
	}


	public void setIdReservationMidi(long idReservationMidi) {
		this.idReservationMidi = idReservationMidi;
	}


	public Date getDateReservationMidi() {
		return dateReservationMidi;
	}


	public void setDateReservationMidi(Date dateReservationMidi) {
		this.dateReservationMidi = dateReservationMidi;
	}


	public int getNbPersonnnesReservationMidi() {
		return nbPersonnnesReservationMidi;
	}


	public void setNbPersonnnesReservationMidi(int nbPersonnnesReservationMidi) {
		this.nbPersonnnesReservationMidi = nbPersonnnesReservationMidi;
	}


	public User getClient() {
		return client;
	}


	public void setClient(User client) {
		this.client = client;
	}



	
	
	
}
