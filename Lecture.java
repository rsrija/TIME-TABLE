
package timetableapp;

import org.joda.time.DateTime;
import universityrecord.Course;

class Lecture {

    DateTime startTime;
    DateTime endTime;
    Course course;

    public Lecture(DateTime startTime, DateTime endTime, Course course) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.course = course;
    }

    @Override
    public String toString() {
        return ""+course.getName() +"  " ;
    }


    
}
