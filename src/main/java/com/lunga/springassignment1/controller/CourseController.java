package com.lunga.springassignment1.controller;
import com.lunga.springassignment1.model.Course;
import com.lunga.springassignment1.service.CourseProcessor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    private final CourseProcessor courseprocessor;

    public CourseController(CourseProcessor courseprocessor){
        this.courseprocessor=courseprocessor;

    }
    @GetMapping("/courses")
    public List<Course> pullCourse(){
        return courseprocessor.pullCourses();

    }
    @PostMapping("/courses")
    public void createCourse(@RequestBody Course comp){
        courseprocessor.createCourse(comp);
        System.out.println("Received: "+ comp.getCoursecode());
    }


}
