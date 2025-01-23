package com.example.studyroom.service;

import com.example.studyroom.dao.Seat;
import com.example.studyroom.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {

    @Autowired
    private SeatRepository seatRepository;

    public List<Seat> getSeatList(){
        return seatRepository.findAll();
    }
}
