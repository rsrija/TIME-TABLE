
package timetableapp;

import university.UniversityData;


public class TimeTableApp {


    public static void main(String[] args){

        UniversityData data = new UniversityData().InitializeData();
        
        
        TimeTable table = new TimeTable();
        table.generateTimetable(data);
    }

    

}
