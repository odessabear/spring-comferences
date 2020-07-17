package com.example.demo.conference.services;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class ConferenceDTO {

    String id;
    String name;
    String vanue;
    ZonedDateTime startDate;
    ZonedDateTime finishDate;
}
