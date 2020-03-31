package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommande {
	
	@Id
	@GeneratedValue
	private long idLigneCommande;
	
	@ManyToOne
	private Commande commande;
	@ManyToOne
	private Plat plat;
	
	
	public LigneCommande() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LigneCommande(Commande commande, Plat plat) {
		super();
		this.commande = commande;
		this.plat = plat;
	}


	public long getIdLigneCommande() {
		return idLigneCommande;
	}


	public void setIdLigneCommande(long idLigneCommande) {
		this.idLigneCommande = idLigneCommande;
	}


	public Commande getCommande() {
		return commande;
	}


	public void setCommande(Commande commande) {
		this.commande = commande;
	}


	public Plat getPlat() {
		return plat;
	}


	public void setPlat(Plat plat) {
		this.plat = plat;
	}


	@Override
	public String toString() {
		return "LigneCommande [idLigneCommande=" + idLigneCommande + ", commande=" + commande + ", plat=" + plat + "]";
	}


	
	
	
	
	

}
