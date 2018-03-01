package timetableapp;

import university.UniversityData;

class TimeTable {

    Day[] days;

    public TimeTable() {
        days = new Day[5];
        initializeDays();
    }

    public void generateTimetable(UniversityData data){

        for (int i = 0; i < 5; i++) {
            days[i].generateTableByDay(data);
        }
    }

    private void initializeDays() {
        for (int i = 0; i < 5; i++) {
            days[i] = new Day(10);
        }
    }

}
