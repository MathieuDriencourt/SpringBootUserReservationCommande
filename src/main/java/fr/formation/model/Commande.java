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
	@ManyToOne
	private Plat plat;
	@ManyToOne
	private Entree entree;
	@ManyToOne
	private Dessert dessert;
	@ManyToOne
	private Boisson boisson;

	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commande(double montantCommande, User employee, Plat plat, Entree entree, Dessert dessert, Boisson boisson) {
		super();
		this.montantCommande = montantCommande;
		this.employee = employee;
		this.plat = plat;
		this.entree = entree;
		this.dessert = dessert;
		this.boisson = boisson;
	}

	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", montantCommande=" + montantCommande + ", employee=" + employee
				+ ", plat=" + plat + ", entree=" + entree + ", dessert=" + dessert + ", boisson=" + boisson + "]";
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

	public Plat getPlat() {
		return plat;
	}

	public void setPlat(Plat plat) {
		this.plat = plat;
	}

	public Entree getEntree() {
		return entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}

	public Boisson getBoisson() {
		return boisson;
	}

	public void setBoisson(Boisson boisson) {
		this.boisson = boisson;
	}

	
	
	
	

}
