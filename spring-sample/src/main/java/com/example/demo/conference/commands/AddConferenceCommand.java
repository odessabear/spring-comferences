package com.example.demo.conference.commands;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class AddConferenceCommand {

    String name;
    String vanue;
    ZonedDateTime startDate;
    ZonedDateTime finishDate;
}
