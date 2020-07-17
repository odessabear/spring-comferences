package com.example.demo.controllers;

import com.example.demo.conference.commands.AddConferenceCommand;
import com.example.demo.conference.commands.AddConferenceHandler;
import com.example.demo.conference.dao.ConferenceDAO;
import com.example.demo.conference.dao.ConferenceQueryEntity;
import com.example.demo.conference.services.ConferenceDTO;
import com.example.demo.conference.services.ConferenceService;
import com.example.demo.infrastructure.commands.CommandHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("cqrs-like-conferences")
public class CQRSConferenceController {

    @Autowired
    CommandHandler<AddConferenceCommand> addConferenceHandler;

    @Autowired
    ConferenceDAO conferenceDAO;

    @GetMapping(produces = "application/json")
    public List<ConferenceQueryEntity> getConferences() {
        return StreamSupport.stream(conferenceDAO.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @PostMapping(consumes = "application/json")
    public void addConference(AddConferenceCommand conference) {
        addConferenceHandler.handle(conference);
    }
}
