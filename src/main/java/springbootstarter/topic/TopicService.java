package springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by luisgarcia on 6/17/17.
 */


@Service
public class TopicService
{
    @Autowired
    private TopicRepo topicRepo;


     public  List<Topic> getAllTopics()
     {
         List<Topic> topics = new ArrayList<>();
         topicRepo.findAll().forEach(topics::add);
         return topics;
     }

     public Topic getTopicById(String id)
     {
         //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
         return topicRepo.findOne(id);
     }

     public void addTopic(Topic topic)
     {
        topicRepo.save(topic);
     }

    public void updateTopic(Topic topic, String id)
    {
        topicRepo.save(topic);
    }

    public void deleteTopic(String id)
    {
        topicRepo.delete(id);
    }
}
