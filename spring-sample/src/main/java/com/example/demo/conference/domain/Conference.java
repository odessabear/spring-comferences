package com.example.demo.conference.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;

@Entity
@Table(name = "CONFERENCE")
@Data
@Accessors(chain = true)
public class Conference {

    @Id
    //@Ge
    String id;
    String name;
    String venue;
    ZonedDateTime startDate;
    ZonedDateTime finishDate;
}
