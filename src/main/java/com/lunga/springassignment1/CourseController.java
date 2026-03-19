package com.lunga.springassignment1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public Map<String, List<String>> getCourses() {

        Map<String, List<String>> courses = new HashMap<>();

        courses.put("Foundation Courses", Arrays.asList(
                "Introduction to Programming",
                "Computer Fundamentals"
        ));

        courses.put("Undergraduate Courses", Arrays.asList(
                "Data Structures",
                "Operating Systems",
                "Database Systems",
                "Software Engineering",
                "Computer Networks"
        ));

        courses.put("Honours Courses", Arrays.asList(
                "Advanced Algorithms",
                "Machine Learning",
                "Distributed Systems",
                "Cyber Security"
        ));

        return courses;
    }
}