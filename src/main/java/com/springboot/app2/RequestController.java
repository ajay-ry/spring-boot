package com.springboot.app2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class RequestController {



    @Autowired
    private TopicRepository topicRepository;


    //Topic objects will be automatically converted to json.
    @RequestMapping("/topics")
    public List<Topic> getTopicsFromService(){

        //return topicService.getTopics();

        //usage of orm (JPA)
        List<Topic> topics = new ArrayList<Topic>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    //Usage of path variable
    @RequestMapping("/topic/{id}")
    public Optional<Topic> getTopic(@PathVariable String id){
        //return topicService.getTopic(id);
        return topicRepository.findById(id);
    }



    //Posting a request. Significance of method parameter in PostMapping anotation and usage of RequestBody that maps json to Topic object automatically.

    //@RequestMapping(method = RequestMethod.POST,value="/topics")
    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic){
        topicRepository.save(topic);
        //topicService.addTopic(topic);
    }

    @PutMapping(value="/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        //topicService.updateTopic(topic,id);
        topicRepository.save(topic);
    }

    @DeleteMapping(value="/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicRepository.deleteById(id);
        //topicService.deleteTopic(id);
    }

}
