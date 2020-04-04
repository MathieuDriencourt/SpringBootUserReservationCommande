package fr.formation.service;

import java.util.List;

import fr.formation.model.ReservationMidi;



public interface IReservationMidiService {

	public List<ReservationMidi> getAllReservation();
	public ReservationMidi getReservation(Long idReservation);
	public ReservationMidi createReservation(ReservationMidi rm);
	public int deleteReservation(Long idReservation);
	public ReservationMidi updateReservation(ReservationMidi rm);
}
