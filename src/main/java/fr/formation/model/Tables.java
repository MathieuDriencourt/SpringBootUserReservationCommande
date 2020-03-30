package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Tables {
	
	@Id
	@GeneratedValue
	private long idTables;
	private int nbPlacesAssisesTables;
	private String statusTables;
	
	@ManyToOne
	private Reservation reservation;

	public Tables() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tables(int nbPlacesAssisesTables, String statusTables, Reservation reservation) {
		super();
		this.nbPlacesAssisesTables = nbPlacesAssisesTables;
		this.statusTables = statusTables;
		this.reservation = reservation;
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

	public String getStatusTables() {
		return statusTables;
	}

	public void setStatusTables(String statusTables) {
		this.statusTables = statusTables;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "Table [idTable=" + idTables + ", nbPlacesAssisesTable=" + nbPlacesAssisesTables + ", statusTable="
				+ statusTables + ", reservation=" + reservation + "]";
	}
	
	

}
