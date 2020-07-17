package com.example.demo.controllers;

import com.example.demo.conference.services.ConferenceDTO;
import com.example.demo.conference.services.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("conferences")
public class ClassicConferenceController {

    @Autowired
    ConferenceService conferenceService;

    @GetMapping(produces = "application/json")
    public List<ConferenceDTO> getConferences() {
        return conferenceService.getConferencesList();

    }

    @PostMapping(consumes = "application/json")
    public void addConference(ConferenceDTO conference) {
        conferenceService.addConference(conference);
    }
}
