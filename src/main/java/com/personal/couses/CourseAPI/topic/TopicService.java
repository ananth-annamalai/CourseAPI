package com.personal.couses.CourseAPI.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics =  new ArrayList<>(Arrays.asList(new Topic("java", "Java Language", "Learn Java Language"),
            new Topic("spring", "Spring Framework", " Learn Spring Framework"),
            new Topic("spring-boot", "Spring Boot Project ", "Learn Spring Boot Project ")));

    public List<Topic> getTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter( t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        System.out.println(topic.toString());
        for (int i = 0; i < topics.size(); i++) {
            if (topics.get(i).getId().equals(id)) {
                topics.set(i,topic);
                break;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
