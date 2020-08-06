package com.example.demo.conference.dao;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class ConferenceQueryEntity {

    String id;
    String name;
    String venue;
    ZonedDateTime startDate;
    ZonedDateTime finishDate;
}
