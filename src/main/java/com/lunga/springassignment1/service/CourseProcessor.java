package com.lunga.springassignment1.service;
import com.lunga.springassignment1.model.Course;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class CourseProcessor {

    private final List<Course> computerCourses = new ArrayList<>();

    public CourseProcessor(){
        computerCourses.add(new Course("samson", "csc313", 8, "scienceblock", "greathall", 16));
        computerCourses.add(new Course("peter", "csc312", 8, "livingstone", "greathall", 16));

    }

   public List<Course> pullcourses(){
        return computerCourses;
   }

}
