
package university;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import universityrecord.Course;
import universityrecord.Student;
import universityrecord.Teachers;

public class UniversityData {

    public Course[] course;
    public Student[] student;
    public Teachers[] teacher;

    public UniversityData() {
	// Thats the change !
    }

    public UniversityData InitializeData() {
        Random rand = new Random();
        course = new Course[200];
        for (int i = 0; i < 200; i++) {
            course[i] = new Course("Course " + (i + 1), rand.nextInt(4 - 2) + 3,
                    (char) (rand.nextInt(5) + 65));
        }

        student = new Student[1000];

        for (int i = 0; i < student.length; i++) {
            Set<Course> temp = new HashSet();
            while (temp.size() != 5) {
                temp.add(course[rand.nextInt(200)]);

            }
            student[i] = new Student("Student " + i, temp);
        }

        teacher = new Teachers[100];

        for (int i = 0; i < teacher.length; i++) {

            Set<Course> temp = new HashSet();
            while (temp.size() != 3) {
                temp.add(course[rand.nextInt(200)]);

            }
            teacher[i] = new Teachers("Teacher " + i, temp);

        }

        return this;
    }

}
