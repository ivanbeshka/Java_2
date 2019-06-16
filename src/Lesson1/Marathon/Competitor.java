package Lesson1.Marathon;

public interface Competitor {
    void run(int dist);
    void jump(int height);
    void swim(int dist);
    boolean isOnDistance();
    void info();
}
