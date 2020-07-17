package com.example.demo.conference.services;

import com.example.demo.conference.domain.Conference;
import com.example.demo.conference.domain.ConferenceRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Service
public class ConferenceService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    ConferenceRepository conferenceRepository;

    public void addConference(ConferenceDTO conference) {

        Conference conferenceObj = modelMapper.map(conference, Conference.class);
        conferenceRepository.save(conferenceObj);
    }

    public List<ConferenceDTO> getConferencesList() {
        List<ConferenceDTO> ret = new LinkedList<>();

        Iterator<Conference> iter = conferenceRepository.findAll().iterator();
        while(iter.hasNext()) {
            Conference conf = iter.next();
            ConferenceDTO conferenceObj = modelMapper.map(conf, ConferenceDTO.class);
            ret.add(conferenceObj);
        }
        return ret;
    }
}
