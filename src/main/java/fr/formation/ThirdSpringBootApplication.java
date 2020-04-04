	package fr.formation;




import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import fr.formation.model.Commande;
//import fr.formation.model.Role;
//import fr.formation.model.User;
import fr.formation.service.ICommandeService;

import fr.formation.service.IReservationSoirService;
import fr.formation.service.IRoleService;
import fr.formation.service.IUserService;



@SpringBootApplication
public class ThirdSpringBootApplication implements CommandLineRunner{
	@Autowired
	IReservationSoirService servicep;
	@Autowired
	ICommandeService servicec;
	
//	ILigneCommandeService servicelc;
	@Autowired
	IUserService serviceu;
	@Autowired
	IRoleService servicer;
	

	public static void main(String[] args) {
		SpringApplication.run(ThirdSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
//		Plat p1 = new Plat();
//		p1.setPrixPlat(22);
//		p1.setNomPlat("Plateau de fruits de mer");
//	
//		
//		servicep.createPlat(p1);
		
		
		
		
//		Role r1 = new Role();
//		r1.setNomRole("Employee");
//		servicer.createRole(r1);
//		
//		
//		User u1 = new User();
//		u1.setNomUser("Mangeot");
//		u1.setPrenomUser("Julien");
//		u1.setMailUser("julien.mangeot@orange.fr");
//		u1.setRole(r1);
//		serviceu.createUser(u1);
//		
//		Commande c1 = new Commande();
//		c1.setMontantCommande(22);
//		c1.setEmployee(u1);
//		servicec.createCommande(c1);
		
		
	}

}
