package com.example.demo.conference.dao;

import com.example.demo.conference.domain.Conference;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ConferenceDAO extends CrudRepository<ConferenceQueryEntity, String> {

}
