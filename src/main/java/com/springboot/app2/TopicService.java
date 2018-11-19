package com.springboot.app2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("java","101", "java description"),
            new Topic("python","102", "python description"),
            new Topic("spring","103", "spring description")));

    public List<Topic> getTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        System.out.println("Searching for id:"+id);
        return topics.stream().filter(t -> String.valueOf(t.getTopic_id()).equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void updateTopic(Topic new_topic, String id) {
        for(int i=0;i<topics.size();i++){
            Topic topic = topics.get(i);
            if(topic.getTopic_id().equals(id)){
                topics.set(i,new_topic);
                break;
            }
        }
    }

    public void deleteTopic(String id) {
        for(int i=0;i<=topics.size();i++){
            if(topics.get(i).getTopic_id().equals(id)){
                topics.remove(i);
            }
        }
    }
}
