package com.example.studyroom.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Seat {

    @Id
    private int pk;

    /** 좌석명 **/
    private String name;

    /** 0 비어 있음, 1 좌석 있음 **/
    private String status;

}
