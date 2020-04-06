package fr.formation.service;

import java.util.Date;
import java.util.List;

import fr.formation.model.ReservationMidi;



public interface IReservationMidiService {

	public List<ReservationMidi> getAllReservationMidi();
	public ReservationMidi getReservationMidi(Long idReservation);
	public ReservationMidi createReservationMidi(ReservationMidi rm);
	public int deleteReservationMidi(Long idReservation);
	public ReservationMidi updateReservationMidi(ReservationMidi rm);
	public int nbPlacesRestantes (Date date);
}
