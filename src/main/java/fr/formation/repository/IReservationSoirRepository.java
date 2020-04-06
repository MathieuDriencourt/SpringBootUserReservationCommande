package fr.formation.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.model.ReservationSoir;



public interface IReservationSoirRepository extends JpaRepository<ReservationSoir, Long>{

	public List<ReservationSoir> findByDateReservationSoirIs(Date dateReservationSoir);
}
