package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCommande;
	private double montantCommande;
	
	@ManyToOne
	private User employee;

	public Commande(double montantCommande, User employee) {
		super();
		this.montantCommande = montantCommande;
		this.employee = employee;
	}

	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(long idCommande) {
		this.idCommande = idCommande;
	}

	public double getMontantCommande() {
		return montantCommande;
	}

	public void setMontantCommande(double montantCommande) {
		this.montantCommande = montantCommande;
	}

	public User getEmployee() {
		return employee;
	}

	public void setEmployee(User employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", montantCommande=" + montantCommande + ", employee=" + employee
				+ "]";
	}
	
	
	

}
