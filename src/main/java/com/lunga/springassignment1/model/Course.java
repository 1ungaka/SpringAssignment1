package com.lunga.springassignment1.model;

public class Course {
    private String instructor;
    private String coursecode;
    private int credits;
    private String officelocation;
    private int officehours;
    private String practicalvenue;

    public Course(){

    }

    public Course(String instructor, String coursecode, int officehours, String officelocation, String practicalvenue, int credits) {
        this.instructor = instructor;
        this.coursecode = coursecode;
        this.credits = credits;
        this.officelocation = officelocation;
        this.officehours = officehours;
        this.practicalvenue = practicalvenue;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getCoursecode() {
        return coursecode;
    }

    public Integer getCredits() {

        return credits;
    }

    public String getOfficelocation() {

        return officelocation;
    }

    public int getOfficehours() {

        return officehours;
    }

    public String getPracticalvenue() {
        return practicalvenue;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setCoursecode( String coursecode){
        this.coursecode= coursecode;
    }
    public void setCredits(int credits ){
        this.credits= credits;
    }
    public void setOfficelocation( String officelocation){
        this.officelocation = officelocation;
    }
    public void setOfficehours( int officehours){
        this.officehours=officehours;
    }
    public void setPracticalvenue(String practicalvenue){
        this.practicalvenue=practicalvenue;
    }
}