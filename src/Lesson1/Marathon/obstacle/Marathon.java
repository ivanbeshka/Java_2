package Lesson1.Marathon.obstacle;

import Lesson1.Marathon.Competitor;

public class Marathon extends Obstacle {
    int length;

    public Marathon(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }

    public int getLength(){
        return length;
    }
}
