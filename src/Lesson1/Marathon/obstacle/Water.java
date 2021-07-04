package Lesson1.Marathon.obstacle;

import Lesson1.Marathon.Competitor;

public class Water extends Obstacle {

    int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }

    public int getLength(){
        return length;
    }
}
