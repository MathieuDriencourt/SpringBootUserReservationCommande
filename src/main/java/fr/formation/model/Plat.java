package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Plat {
	
	@Id
	@GeneratedValue
	private long idPlat;
	private double prixPlat;
	private String nomPlat;

	public Plat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Plat(double prixPlat, String nomPlat) {
		super();
		this.prixPlat = prixPlat;
		this.nomPlat = nomPlat;
	}

	public long getIdPlat() {
		return idPlat;
	}

	public void setIdPlat(long idPlat) {
		this.idPlat = idPlat;
	}

	public double getPrixPlat() {
		return prixPlat;
	}

	public void setPrixPlat(double prixPlat) {
		this.prixPlat = prixPlat;
	}

	public String getNomPlat() {
		return nomPlat;
	}

	public void setNomPlat(String nomPlat) {
		this.nomPlat = nomPlat;
	}

	@Override
	public String toString() {
		return "Plat [idPlat=" + idPlat + ", prixPlat=" + prixPlat + ", nomPlat=" + nomPlat + "]";
	}
	
	
	


	
	

}
