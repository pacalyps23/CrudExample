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

     private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic ("Spring", "Spring Framework", "SpringFrameworkDescption"),
                new Topic("Fall", "Ionic", "Mobile App"),
                new Topic("Winter", "Angular", "Web App")
        ));

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
        for(int i = 0; i < topics.size(); i++)
        {
            Topic t = topics.get(i);
            if(t.getId().equals(id))
            {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id)
    {
        topics.removeIf(topic -> topic.getId().equals(id));
    }
}
