package com.example.studyroom.vo;


import java.sql.Timestamp;

public record SeatReservationVo (
    int pk,
    String seatName,
    Timestamp startTime,
    Timestamp endTime
){}