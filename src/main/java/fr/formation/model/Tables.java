package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Tables {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTables;
	private int nbPlacesAssisesTables;
	private boolean statusTables;
	
	@ManyToOne
	private Reservation reservation;

	public Tables() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tables(int nbPlacesAssisesTables, boolean statusTables, Reservation reservation) {
		super();
		this.nbPlacesAssisesTables = nbPlacesAssisesTables;
		this.statusTables = statusTables;
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "Tables [idTables=" + idTables + ", nbPlacesAssisesTables=" + nbPlacesAssisesTables + ", statusTables="
				+ statusTables + ", reservation=" + reservation + "]";
	}

	public long getIdTables() {
		return idTables;
	}

	public void setIdTables(long idTables) {
		this.idTables = idTables;
	}

	public int getNbPlacesAssisesTables() {
		return nbPlacesAssisesTables;
	}

	public void setNbPlacesAssisesTables(int nbPlacesAssisesTables) {
		this.nbPlacesAssisesTables = nbPlacesAssisesTables;
	}

	public boolean isStatusTables() {
		return statusTables;
	}

	public void setStatusTables(boolean statusTables) {
		this.statusTables = statusTables;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}


	

}
