package Lesson1.Marathon;

import Lesson1.Marathon.obstacle.Marathon;
import Lesson1.Marathon.obstacle.Wall;
import Lesson1.Marathon.obstacle.Water;

public class Team {

    Competitor[] competitor;

    public Team(String dogName, String catName, String human1Name, String human2Name) {
        competitor = new Competitor[]{new Dog(dogName),new Cat(catName), new Human(human1Name), new Human(human2Name)};
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
