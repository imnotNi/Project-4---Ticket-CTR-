package com.example.cinema_client.models;

import java.util.List;
import javax.servlet.http.Part;

import lombok.Data;
import lombok.Getter;

@Data
public class BranchDTO {
    private int id;
    private String imgURL;
    private String name;
    private String diaChi;
    private String phoneNo;
    private List<ScheduleDTO> schedules;
    private List<MovieDTO> movies;
    private Long total;
    private Long totalTicket;
    
}
