package springbootstarter.Courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luisgarcia on 6/17/17.
 */


@Service
public class CourseService
{
    @Autowired
    private CourseRepo courseRepo;


     public  List<Course> getAllCourses(String topicId)
     {
         List<Course> courses = new ArrayList<>();
         courseRepo.findByTopicId(topicId).forEach(courses::add);
         return courses;
     }

     public Course getCourseById(String id)
     {
         //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
         return courseRepo.findOne(id);
     }

     public void addCourse(Course course)
     {
        courseRepo.save(course);
     }

    public void updateCourse(Course course)
    {
        courseRepo.save(course);
    }

    public void deleteCourse(String id)
    {
        courseRepo.delete(id);
    }
}
