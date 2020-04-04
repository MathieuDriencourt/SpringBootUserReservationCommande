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

import fr.formation.model.ReservationMidi;


import fr.formation.service.IReservationMidiService;


@RestController
@RequestMapping("reservationmidi") //URL du webservice
@CrossOrigin("http://localhost:4200")
public class ReservationMidiController {

	
	@Autowired
	IReservationMidiService reservationService;
	
	//IUserService userService;
	
	@GetMapping("/all")
	public List<ReservationMidi> getAllReservation() {
		return reservationService.getAllReservation();
	}
	
	@GetMapping("/{id}")
	public ReservationMidi getById(@PathVariable long id) {
		return reservationService.getReservation(id);
	}
	
	@PostMapping
	public ReservationMidi createReservation(@RequestBody ReservationMidi reservation) {
		return reservationService.createReservation(reservation);
	}
	
	@DeleteMapping("/{id}")
	public int deleteReservation(@PathVariable long id) {
		return reservationService.deleteReservation(id);
	}
	
	@PutMapping("/{id}")
	public ReservationMidi updateReservation(@PathVariable long id, @RequestBody ReservationMidi reservation) {
		ReservationMidi reservationAModifier = reservationService.getReservation(id);
		reservationAModifier.setDateReservationMidi(reservation.getDateReservationMidi());
		reservationAModifier.setNbPersonnnesReservationMidi(reservation.getNbPersonnnesReservationMidi());
		return reservationService.updateReservation(reservationAModifier);
	}
	
//	@PutMapping("/{idR}/set/{idU}")
//	public boolean affectationReservationUser(@PathVariable long idR, @PathVariable long idU) {
//		ReservationMidi alinker=reservationService.getReservation(idR);
//		User linker=userService.getUser(idU);
//		alinker.setClient(linker);
//		reservationService.createReservation(alinker);
//		return true;
//	}
}
