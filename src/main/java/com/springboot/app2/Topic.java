package com.springboot.app2;

import javax.persistence.Entity;
import javax.persistence.Id;


//Entity annotation tells that this class has to be mapped to a table schema.
@Entity
public class Topic {
    private String topic_name;
    //Id annotation represents that its a primary key.
    @Id
    private String topic_id;
    private String topic_description;

    public Topic(String topic_name,String topic_id,String topic_description){
        this.topic_name=topic_name;
        this.topic_id=topic_id;
        this.topic_description=topic_description;
    }
    public Topic(){

    }

    /*
        Getter and setter methods are essential
     */

    public String getTopic_name() {
        return topic_name;
    }

    public void setTopic_name(String topic_name) {
        this.topic_name = topic_name;
    }

    public String getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(String topic_id) {
        this.topic_id = topic_id;
    }

    public String getTopic_description() {
        return topic_description;
    }

    public void setTopic_description(String topic_description) {
        this.topic_description = topic_description;
    }
}
