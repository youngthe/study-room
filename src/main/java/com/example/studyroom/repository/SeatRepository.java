package com.example.studyroom.repository;

import com.example.studyroom.dao.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Integer> {
}
