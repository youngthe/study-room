package com.example.studyroom.repository;

import com.example.studyroom.dao.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
