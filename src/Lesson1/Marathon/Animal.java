package Lesson1.Marathon;

public class Animal implements Competitor {

    String type;
    String name;

    int runDistance;
    int swimDistance;
    int jumpHeight;

    boolean onDistance;

    public Animal(String type, String name, int runDistance, int swimDistance, int jumpHeight) {
        this.type = type;
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.jumpHeight = jumpHeight;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {

        if (dist <= runDistance) {
            System.out.println(type + " " + name + " run true");
        } else {
            System.out.println(type + " " + name + " run false");
            onDistance = false;
        }

    }

    @Override
    public void jump(int height) {

        if (height <= jumpHeight) {
            System.out.println(type + " " + name + " jump true");
        } else {
            System.out.println(type + " " + name + " jump false");
            onDistance = false;
        }

    }

    @Override
    public void swim(int dist) {

        if (dist <= swimDistance) {
            System.out.println(type + " " + name + " swim true");
        } else {
            System.out.println(type + " " + name + " swim false");
            onDistance = false;
        }

    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " is on distance : " + onDistance);
    }
}
