package com.personal.couses.CourseAPI.courses;

import com.personal.couses.CourseAPI.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {


    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @RequestMapping("/topics/{topicId}/courses")
    public List<Course> getTopics( @PathVariable String topicId)
    {
        return courseService.getCourses(topicId);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id) {
        return courseService.getCourse(id);
    }

    @RequestMapping(value = "/topics/{topicId}/courses",method = RequestMethod.POST)
    public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }

    @RequestMapping(value = "/topics/{topicId}/courses/{id}",method = RequestMethod.PUT)
    public void updateCourse(@RequestBody Course course,@PathVariable String id,@PathVariable String topicId) {
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(course,id);
    }

    @RequestMapping(value = "/topics/{topicId}/courses/{id}",method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
    }
}
