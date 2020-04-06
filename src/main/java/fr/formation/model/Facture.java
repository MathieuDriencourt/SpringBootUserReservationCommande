package fr.formation.model;






import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Facture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idFacture;
	private double montantFacture;
	

	
	@OneToOne
	private Commande commande;



	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Facture(double montantFacture, Commande commande) {
		super();
		this.montantFacture = montantFacture;
		this.commande = commande;
	}



	@Override
	public String toString() {
		return "Facture [idFacture=" + idFacture + ", montantFacture=" + montantFacture + ", commande=" + commande
				+ "]";
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



	public Commande getCommande() {
		return commande;
	}



	public void setCommande(Commande commande) {
		this.commande = commande;
	}


	


	
	
}
