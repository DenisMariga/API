package com.denis.API;

public class Course {
   private int course_id;
   private String Course_name;
   private String course_author;
   

public Course(int course_id, String course_name, String course_author) {
	super();
	this.course_id = course_id;
	Course_name = course_name;
	this.course_author = course_author;
}

/**
 * @return the course_id
 */
public int getCourse_id() {
	return course_id;
}

/**
 * @param course_id the course_id to set
 */
public void setCourse_id(int course_id) {
	this.course_id = course_id;
}

/**
 * @return the course_name
 */
public String getCourse_name() {
	return Course_name;
}

/**
 * @param course_name the course_name to set
 */
public void setCourse_name(String course_name) {
	Course_name = course_name;
}

/**
 * @return the course_author
 */
public String getCourse_author() {
	return course_author;
}

/**
 * @param course_author the course_author to set
 */
public void setCourse_author(String course_author) {
	this.course_author = course_author;
}

@Override
public String toString() {
	return "Course [course_id=" + course_id + ", Course_name=" + Course_name + ", course_author=" + course_author + "]";
}
   
}
