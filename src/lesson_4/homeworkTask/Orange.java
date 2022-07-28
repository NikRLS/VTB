package lesson_4.homeworkTask;

public class Orange extends Fruit{
    static float weightOfOrange = 1.5f;
    static int count;
    String name;

    public Orange() {
        super(weightOfOrange);
        count++;
        name = "orange " + count;
    }

    @Override
    public String toString() {
        return name;
    }
}
