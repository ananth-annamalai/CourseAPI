package com.personal.couses.CourseAPI.courses;

import com.personal.couses.CourseAPI.topic.Topic;
import com.personal.couses.CourseAPI.topic.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id) {
       // return topics.stream().filter( t -> t.getId().equals(id)).findFirst().get();
        return courseRepository.findById(id).orElse(null);
    }

    public void addCourse(Course course) {
        //topics.add(topic);
        courseRepository.save(course);
    }

    public void updateCourse(Course course, String id) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
       // topics.removeIf(t -> t.getId().equals(id));
        courseRepository.deleteById(id);
    }
}
