package com.example.studyroom.dao;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Timestamp;

@Table
@Entity
@Getter
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pk;

    @ManyToOne
    @JoinColumn(name = "seat_pk", nullable = false) // 외래 키 컬럼명 지정
    @JsonBackReference
    private Seat seat;

    private Timestamp startTime;
    private Timestamp endTime;

}
