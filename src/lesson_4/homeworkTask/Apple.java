package lesson_4.homeworkTask;

public class Apple extends Fruit{
    static float weightOfApple = 1.0f;
    static int count;
    String name;

    public Apple() {
        super(weightOfApple);
        ++count;
        name = "apple " + count;
    }

    @Override
    public String toString() {
        return name;
    }
}
