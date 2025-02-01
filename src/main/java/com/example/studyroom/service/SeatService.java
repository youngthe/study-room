package com.example.studyroom.service;

import com.example.studyroom.dao.Reservation;
import com.example.studyroom.dao.Seat;
import com.example.studyroom.repository.ReservationRepository;
import com.example.studyroom.repository.SeatRepository;
import com.example.studyroom.vo.SeatReservationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {

    @Autowired
    private SeatRepository seatRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Seat> getSeatList(){
        return seatRepository.findAll();
    }

    public void saveSeatReservation(SeatReservationVo seatReservationVo){
        Seat getSeat = seatRepository.findById(seatReservationVo.pk()).orElseThrow();
        Reservation reservation = new Reservation();
        reservation.setSeat(getSeat);
        reservation.setStartTime(seatReservationVo.startTime());
        reservation.setEndTime(seatReservationVo.endTime());
        reservationRepository.save(reservation);
    }

    /** 관리자 기능 **/
    public Seat saveSeat(Seat seat){
        return seatRepository.save(seat);
    }
}
