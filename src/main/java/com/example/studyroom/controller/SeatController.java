package com.example.studyroom.controller;

import com.example.studyroom.dao.Seat;
import com.example.studyroom.service.SeatService;
import com.example.studyroom.vo.SeatReservationVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class SeatController {

    @Autowired
    private SeatService seatService;

    @GetMapping("/seat")
    public Map<String, Object> getSeatList(){

        Map<String, Object> result = new HashMap<>();

        try{
            result.put("code", 200);
            result.put("list", seatService.getSeatList());
            return result;
        } catch (Exception e){
            e.printStackTrace();
            result.put("code", 400);
            return result;
        }
    }

    /** 좌석 예약 **/
    @PostMapping("/reservation")
    public Map<String, Object> saveReservation(@RequestBody SeatReservationVo seatReservationVo){

        Map<String, Object> result = new HashMap<>();
        try{
            seatService.saveSeatReservation(seatReservationVo);
            result.put("code", 200);
            return result;
        } catch (Exception e){
            e.printStackTrace();
            result.put("code", 400);
            return result;
        }
    }

    /** 관리자 기능 **/
    @PostMapping("/seat")
    public Map<String, Object> saveSeat(@RequestBody Seat seat){

        Map<String, Object> result = new HashMap<>();
        try{
            seatService.saveSeat(seat);
            result.put("code", 200);
            return result;
        } catch (Exception e){
            e.printStackTrace();
            result.put("code", 400);
            return result;
        }
    }
}
