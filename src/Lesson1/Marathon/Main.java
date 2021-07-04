package Lesson1.Marathon;

import Lesson1.Marathon.obstacle.Course;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(20,1,300);
        Team team = new Team("Sharik","Kisa","Vasya","Petya");

        course.doIt(team);
        team.info();
    }
}
