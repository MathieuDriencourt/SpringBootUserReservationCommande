package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Boisson {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idBoisson;
	private String nomBoisson;
	private double prixBoisson;
	
	
	public Boisson() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Boisson(String nomBoisson, double prixBoisson) {
		super();
		this.nomBoisson = nomBoisson;
		this.prixBoisson = prixBoisson;
	}


	@Override
	public String toString() {
		return "Boisson [idBoisson=" + idBoisson + ", nomBoisson=" + nomBoisson + ", prixBoisson=" + prixBoisson + "]";
	}


	public long getIdBoisson() {
		return idBoisson;
	}


	public void setIdBoisson(long idBoisson) {
		this.idBoisson = idBoisson;
	}


	public String getNomBoisson() {
		return nomBoisson;
	}


	public void setNomBoisson(String nomBoisson) {
		this.nomBoisson = nomBoisson;
	}


	public double getPrixBoisson() {
		return prixBoisson;
	}


	public void setPrixBoisson(double prixBoisson) {
		this.prixBoisson = prixBoisson;
	}
	
	
	
	
}
