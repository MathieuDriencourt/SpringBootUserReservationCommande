package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dessert {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDessert;
	private String nomDessert;
	private double prixDessert;

	
	public Dessert() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Dessert(String nomDessert, double prixDessert) {
		super();
		this.nomDessert = nomDessert;
		this.prixDessert = prixDessert;
	}


	@Override
	public String toString() {
		return "Dessert [idDessert=" + idDessert + ", nomDessert=" + nomDessert + ", prixDessert=" + prixDessert + "]";
	}


	public long getIdDessert() {
		return idDessert;
	}


	public void setIdDessert(long idDessert) {
		this.idDessert = idDessert;
	}


	public String getNomDessert() {
		return nomDessert;
	}


	public void setNomDessert(String nomDessert) {
		this.nomDessert = nomDessert;
	}


	public double getPrixDessert() {
		return prixDessert;
	}


	public void setPrixDessert(double prixDessert) {
		this.prixDessert = prixDessert;
	}
	
	
	
	
}
