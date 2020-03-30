package fr.formation.model;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Facture {

	@Id
	@GeneratedValue
	private long idFacture;
	private double montantFacture;
	private Date dateFacture;

	
	@OneToOne
	private Commande commande;


	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Facture(double montantFacture, Date dateFacture, Commande commande) {
		super();
		this.montantFacture = montantFacture;
		this.dateFacture = dateFacture;
		this.commande = commande;
	}


	public long getIdFacture() {
		return idFacture;
	}


	public void setIdFacture(long idFacture) {
		this.idFacture = idFacture;
	}


	public double getMontantFacture() {
		return montantFacture;
	}


	public void setMontantFacture(double montantFacture) {
		this.montantFacture = montantFacture;
	}


	public Date getDateFacture() {
		return dateFacture;
	}


	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}


	public Commande getCommande() {
		return commande;
	}


	public void setCommande(Commande commande) {
		this.commande = commande;
	}


	@Override
	public String toString() {
		return "Facture [idFacture=" + idFacture + ", montantFacture=" + montantFacture + ", dateFacture=" + dateFacture
				+ ", commande=" + commande + "]";
	}
	
	

	
	
}
