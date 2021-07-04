package Lesson1.Marathon.obstacle;

import Lesson1.Marathon.Competitor;

public class Wall extends Obstacle {
    int length;

    public Wall(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(length);
    }

    public int getLength(){
        return length;
    }
}
