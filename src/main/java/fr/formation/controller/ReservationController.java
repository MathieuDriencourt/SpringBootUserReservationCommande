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

import fr.formation.model.Reservation;

import fr.formation.model.User;
import fr.formation.service.IReservationService;
import fr.formation.service.IUserService;

@RestController
@RequestMapping("reservation") //URL du webservice
@CrossOrigin("http://localhost:4200")
public class ReservationController {

	
	@Autowired
	IReservationService reservationService;
	@Autowired
	IUserService userService;
	
	@GetMapping("/all")
	public List<Reservation> getAllReservation() {
		return reservationService.getAllReservation();
	}
	
	@GetMapping("/{id}")
	public Reservation getById(@PathVariable long id) {
		return reservationService.getReservation(id);
	}
	
	@PostMapping
	public Reservation createReservation(@RequestBody Reservation reservation) {
		return reservationService.createReservation(reservation);
	}
	
	@DeleteMapping("/{id}")
	public int deleteReservation(@PathVariable long id) {
		return reservationService.deleteReservation(id);
	}
	
	@PutMapping("/{id}")
	public Reservation updateReservation(@PathVariable long id, @RequestBody Reservation reservation) {
		Reservation reservationAModifier = reservationService.getReservation(id);
		reservationAModifier.setDateReservation(reservation.getDateReservation());
		reservationAModifier.setHeureReservation(reservation.getHeureReservation());
		reservationAModifier.setNbPersonnnesReservation(reservation.getNbPersonnnesReservation());
		return reservationService.updateReservation(reservationAModifier);
	}
	
	@PutMapping("/{idR}/set/{idU}")
	public boolean affectationReservationUser(@PathVariable long idR, @PathVariable long idU) {
		Reservation alinker=reservationService.getReservation(idR);
		User linker=userService.getUser(idU);
		alinker.setClient(linker);
		reservationService.createReservation(alinker);
		return true;
	}
}
