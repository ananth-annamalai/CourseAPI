package com.personal.couses.CourseAPI.topic;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Topic {
    String id;
    String name;
    String description;

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
