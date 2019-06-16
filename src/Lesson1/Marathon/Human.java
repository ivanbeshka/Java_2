package Lesson1.Marathon;

public class Human implements Competitor{

    String name;

    int runDistance;
    int swimDistance;
    int jumpHeight;

    boolean onDistance;

    public Human(String name, int runDistance, int swimDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.jumpHeight = jumpHeight;
        this.onDistance = true;
    }

    public Human(String name){
        this(name,10000,1000,3);
    }

    @Override
    public void run(int dist) {

        if (dist <= runDistance) {
            System.out.println(name + " run true");
        } else {
            System.out.println( name + " run false");
            onDistance = false;
        }

    }

    @Override
    public void jump(int height) {

        if (height <= jumpHeight) {
            System.out.println(name + " jump true");
        } else {
            System.out.println(name + " jump false");
            onDistance = false;
        }

    }

    @Override
    public void swim(int dist) {

        if (dist <= swimDistance) {
            System.out.println(name + " swim true");
        } else {
            System.out.println(name + " swim false");
            onDistance = false;
        }

    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(name + " is on distance : " + onDistance);
    }
}
