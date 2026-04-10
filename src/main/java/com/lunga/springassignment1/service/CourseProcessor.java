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

   public List<Course> pullCourses(){
        return computerCourses;
   }
   public void createCourse(Course comp){
        try {
            computerCourses.add(comp);
            System.out.println(" Course added successfully");

        } catch (Exception e) {
            System.out.println(" Operation fail , please try again");
        }

   }

   public boolean removeCourse(String courseCode){
        for(int i=0;i<computerCourses.size();i++){
            if(computerCourses.get(i).getCoursecode().equals(courseCode)){
                computerCourses.remove(i);
                return true;
            }
        }
        return false;
   }

    public boolean updateCourse(String courseCode, Course newCourse){
        for(int i=0;i<computerCourses.size();i++){
            if(computerCourses.get(i).getCoursecode().equals(courseCode)){
                computerCourses.get(i).setOfficehours(newCourse.getOfficehours());
                computerCourses.get(i).setOfficelocation(newCourse.getOfficelocation());
                computerCourses.get(i).setPracticalvenue(newCourse.getPracticalvenue());
                computerCourses.get(i).setCredits(newCourse.getCredits());
                return true;
            }
        }
        return false;
    }

}
