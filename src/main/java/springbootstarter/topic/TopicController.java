package springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by luisgarcia on 6/17/17.
 */

@RequestMapping("/topics")
@RestController
public class TopicController
{
    @Autowired
    private TopicService topicService;

    @RequestMapping()
    public List<Topic> getAllTopics()
    {
        return topicService.getAllTopics();
    }

    @RequestMapping("/{id}")
    public Topic getTopic(@PathVariable String id)
    {
        return topicService.getTopicById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic)
    {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id)
    {
        topicService.updateTopic(topic, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/{id}")
    public void deleteTopic(@PathVariable String id)
    {
        topicService.deleteTopic( id);
    }

}
