package com.personal.couses.CourseAPI.topic;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@AllArgsConstructor
public class Topic {
    @Id
    private String id;
    private String name;
    private String description;
}
