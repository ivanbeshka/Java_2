package Lesson1.Marathon;

import Lesson1.Marathon.obstacle.Course;
import Lesson1.Marathon.obstacle.Marathon;
import Lesson1.Marathon.obstacle.Wall;
import Lesson1.Marathon.obstacle.Water;

public class Team {

    Competitor[] competitor;

    public Team(String dogName, String catName, String human1Name, String human2Name) {
        competitor[0] = new Dog(dogName);
        competitor[1] = new Cat(catName);
        competitor[2] = new Human(human1Name);
        competitor[3] = new Human(human2Name);
    }


    public void run(Marathon marathon) {
        for (int i = 0; i < competitor.length; i++) {
            competitor[i].run(marathon.getLength());
        }
    }


    public void jump(Wall wall) {

        for (int i = 0; i < competitor.length; i++) {
            competitor[i].jump(wall.getLength());
        }
    }

    public void swim(Water water) {

        for (int i = 0; i < competitor.length; i++) {
            competitor[i].swim(water.getLength());
        }

    }

    public boolean isOnDistance() {
        int allOnDist = 0;
        for (int i = 0; i < competitor.length; i++) {
           if(competitor[i].isOnDistance()){
               allOnDist++;
           }
        }
        if(allOnDist == competitor.length){
            return true;
        }
        return false;
    }

    public void info() {
        for (int i = 0; i < competitor.length; i++) {
            competitor[i].info();
        }
    }
}
