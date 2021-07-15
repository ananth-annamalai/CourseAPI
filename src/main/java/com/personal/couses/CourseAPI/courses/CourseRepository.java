package com.personal.couses.CourseAPI.courses;

import com.personal.couses.CourseAPI.topic.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String> {
    public List<Course> findByTopicId(String topicId);
}
