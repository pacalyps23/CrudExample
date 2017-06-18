package springbootstarter.Courses;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by luisgarcia on 6/17/17.
 */
public interface CourseRepo extends CrudRepository <Course, String>{

    public List<Course> findByTopicId(String topicId);

}
