package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.model.Reservation;

public interface IReservationRepository extends JpaRepository<Reservation, Long>{

}
