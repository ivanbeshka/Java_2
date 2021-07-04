package Lesson1.Marathon.obstacle;

import Lesson1.Marathon.Competitor;
import Lesson1.Marathon.Team;

public class Course{

    Obstacle[] obstacle;

    public Course(int waterLength, int wallHeight, int marathonLength) {
       obstacle = new Obstacle[]{new Water(waterLength),new Wall(wallHeight),new Marathon(marathonLength)};
    }

    public void doIt(Team team){
        team.jump((Wall) obstacle[1]);
        team.run((Marathon) obstacle[2]);
        team.swim((Water) obstacle[0]);
    }

}
