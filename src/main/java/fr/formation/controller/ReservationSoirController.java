package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import fr.formation.model.ReservationSoir;


import fr.formation.service.IReservationSoirService;


@RestController
@RequestMapping("reservationSoir") //URL du webservice
@CrossOrigin("http://localhost:4200")
public class ReservationSoirController {
	
	@Autowired
	IReservationSoirService reservationSoirService;
	
	//IReservationMidiService reservationService;

	
	@GetMapping("/all")
	public List<ReservationSoir> getAllReservationSoir() {
		return reservationSoirService.getAllReservationSoir();
	}
	
	@GetMapping("/{id}")
	public ReservationSoir getById(@PathVariable long id) {
		return reservationSoirService.getReservationSoir(id);
	}
	
	@PostMapping
	public ReservationSoir createReservationSoir(@RequestBody ReservationSoir ReservationSoir) {
		return reservationSoirService.createReservationSoir(ReservationSoir);
	}
	
	@DeleteMapping("/{id}")
	public int deleteReservationSoir(@PathVariable long id) {
		return reservationSoirService.deleteReservationSoir(id);
	}
	
	@PutMapping("/{id}")
	public ReservationSoir updateReservationSoir(@PathVariable long id, @RequestBody ReservationSoir reservationSoir) {
		ReservationSoir reservationSoirAModifier = reservationSoirService.getReservationSoir(id);
		
		reservationSoirAModifier.setDateReservationSoir(reservationSoir.getDateReservationSoir());
		reservationSoirAModifier.setNbPersonnnesReservationSoir(reservationSoir.getNbPersonnnesReservationSoir());
		return reservationSoirService.updateReservationSoir(reservationSoirAModifier);
	}
	
//	@PutMapping("/{idT}/set/{idR}")
//	public boolean affectationTablesReservation(@PathVariable long idT, @PathVariable long idR) {
//		ReservationSoir alinker=tablesService.getTables(idT);
//		ReservationMidi linker=reservationService.getReservation(idR);
//		alinker.setReservation(linker);
//		reservationSoirService.createTables(alinker);
//		return true;
//	}
}
