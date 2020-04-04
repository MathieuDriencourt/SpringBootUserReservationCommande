package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Entree {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEntree;
	private String nomEntree;
	private double prixEntree;

	
	public Entree() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Entree(String nomEntree, double prixEntree) {
		super();
		this.nomEntree = nomEntree;
		this.prixEntree = prixEntree;
	}


	@Override
	public String toString() {
		return "Entree [idEntree=" + idEntree + ", nomEntree=" + nomEntree + ", prixEntree=" + prixEntree + "]";
	}


	public long getIdEntree() {
		return idEntree;
	}


	public void setIdEntree(long idEntree) {
		this.idEntree = idEntree;
	}


	public String getNomEntree() {
		return nomEntree;
	}


	public void setNomEntree(String nomEntree) {
		this.nomEntree = nomEntree;
	}


	public double getPrixEntree() {
		return prixEntree;
	}


	public void setPrixEntree(double prixEntree) {
		this.prixEntree = prixEntree;
	}

}
	