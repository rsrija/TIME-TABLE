package timetableapp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import org.joda.time.DateTime;
import universityrecord.Course;

class Room {

    DateTime timeCounter = new DateTime(2000, 1, 1, 8, 0, 0);
    HashSet<Lecture> lectures;

    public Room() {

        lectures = new LinkedHashSet<>();

    }

    void generateLectures(HashSet<Course> data) {

        Object[] courseArr = data.toArray();
        int index = 0;

        while (timeCounter.getHourOfDay() < 17) {

            Course course = (Course)courseArr[index];
            index++;
            if (!(timeCounter.getHourOfDay() >= 16
                    && (timeCounter.getMinuteOfHour() > 0 || course.getCreditHour() == 3))) {

                if (!(course.getCreditHour() == 3 && course.getCounter() == 2
                        || course.getCreditHour() == 4 && course.getCounter() == 3)) {

                    DateTime start = timeCounter;
                    timeCounter = timeCounter.plusHours(1);
                    if (course.getCreditHour() == 3) {
                        timeCounter = timeCounter.plusMinutes(30);
                    }
                    course.setCounter();
                    
                    lectures.add(new Lecture(start, timeCounter, course));
                }
            }
            else if (timeCounter.getMinuteOfHour() > 0) {
                timeCounter = timeCounter.plusHours(1);
            }
        }
        for (Lecture lecture : lectures) {
            System.out.print(lecture.toString());
        }
        System.out.println("");
    }

}
