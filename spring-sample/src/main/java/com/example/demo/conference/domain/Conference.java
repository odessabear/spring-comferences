package com.example.demo.conference.domain;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class Conference {

    String id;
    String name;
    String vanue;
    ZonedDateTime startDate;
    ZonedDateTime finishDate;
}
