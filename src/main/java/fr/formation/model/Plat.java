package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Plat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPlat;
	private double prixPlat;
	private String nomPlat;

	
	//private Commande commande;

	public Plat() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	

	@Override
	public String toString() {
		return "Plat [idPlat=" + idPlat + ", prixPlat=" + prixPlat + ", nomPlat=" + nomPlat + "]";
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


	
	


	
	

}
