package timetableapp;

import university.UniversityData;
import java.util.HashSet;
import universityrecord.Course;

class Day {

    Room[] rooms;

    public Day(int noOfRooms) {
        rooms = new Room[noOfRooms];
        initializeRoom(noOfRooms);
    }

    public void generateTableByDay(UniversityData data) {

        HashSet<Course> courseData = getRandomCourses(200, data);
        for (Room room : rooms) {
            room.generateLectures(courseData);
        }
        System.out.println("");
    }

    private HashSet<Course> getRandomCourses(int n, UniversityData data) {
     
        HashSet<Course> course = new HashSet<>();
        int index = 0;
        while (course.size() < n) {

            course.add(data.course[index]);
            index++;
        }

        return course;

    }

    private void initializeRoom(int n) {

        for (int i = 0; i < n; i++) {
            rooms[i] = new Room();
        }
    }
}
