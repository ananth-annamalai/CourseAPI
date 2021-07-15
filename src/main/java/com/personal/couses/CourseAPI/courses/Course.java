package com.personal.couses.CourseAPI.courses;

import com.personal.couses.CourseAPI.topic.Topic;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@AllArgsConstructor
public class Course {
    @Id
    private String id;
    private String name;
    private String description;
    @ManyToOne
    private Topic topic;
}
