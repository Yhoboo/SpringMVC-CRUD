package io.javabrains.springbootstarter.topic;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    //17 // 19:add new ArrayList
    private List<Topic> topics = new ArrayList<>( Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring Framework Description"),
                new Topic("Java", "Core Java", "Core Java Description"),
                new Topic("Javascript", "Javascript", "Javascript Description"),
                new Topic("C++","C++","C++ Description")
        ));

    //17
    public List<Topic> getAllTopics(){
        return topics;
    }

    //18
    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    //19
    public void addTopic(Topic topic){
        topics.add(topic);
    }

    //20
    public void updateTopic(String id,Topic topic){
        for (int i=0; i<topics.size(); i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i,topic);
            }
        }
    }

    //20
    public void deleteTopic(String id){
        topics.removeIf(t -> t.getId().equals(id));
    }
}
