package Lesson1.Marathon.obstacle;

import Lesson1.Marathon.Competitor;
import Lesson1.Marathon.Team;

public class Course{

    Obstacle[] obstacle;

    public Course(int waterLength, int wallHeight, int marathonLength) {
        obstacle[0] = new Water(waterLength);
        obstacle[1] = new Wall(wallHeight);
        obstacle[2] = new Marathon(marathonLength);
    }

    public void doIt(Team team) {
        team.swim((Water) obstacle[0]);
        team.run((Marathon) obstacle[2]);
        team.jump((Wall) obstacle[1]);
    }
}
