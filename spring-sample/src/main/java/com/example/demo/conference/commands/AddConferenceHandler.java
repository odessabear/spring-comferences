package com.example.demo.conference.commands;

import com.example.demo.conference.domain.Conference;
import com.example.demo.conference.domain.ConferenceRepository;
import com.example.demo.infrastructure.commands.CommandHandler;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Service
public class AddConferenceHandler implements CommandHandler<AddConferenceCommand> {


    @Autowired
    ModelMapper modelMapper;

    @Autowired
    ConferenceRepository conferenceRepository;

    public void handle(AddConferenceCommand conference) {

        Conference conferenceObj = modelMapper.map(conference, Conference.class);
        conferenceRepository.save(conferenceObj);
    }

}
