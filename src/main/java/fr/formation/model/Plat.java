package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Plat {
	
	@Id
	@GeneratedValue
	private long idPlat;
	private double prixPlat;
	private String nomPlat;
	
	
	@ManyToOne
	private Commande commande;


	public Plat() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Plat(double prixPlat, String nomPlat, Commande commande) {
		super();
		this.prixPlat = prixPlat;
		this.nomPlat = nomPlat;
		this.commande = commande;
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


	public Commande getCommande() {
		return commande;
	}


	public void setCommande(Commande commande) {
		this.commande = commande;
	}


	@Override
	public String toString() {
		return "Plat [idPlat=" + idPlat + ", prixPlat=" + prixPlat + ", nomPlat=" + nomPlat + ", commande=" + commande
				+ "]";
	}


	
	

}
