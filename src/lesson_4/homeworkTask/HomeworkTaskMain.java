package lesson_4.homeworkTask;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeworkTaskMain {
    public static void main(String[] args) {
        ArrayList<Apple> appleArrayList = new ArrayList<>();
        ArrayList<Apple> appleArrayList1 = new ArrayList<>();
        ArrayList<Orange> orangeArrayList = new ArrayList<>();
        for(int i =0; i<6; i++){
            appleArrayList.add(new Apple());
        }
        for (int i=0; i<4; i++){
            appleArrayList1.add(new Apple());
            orangeArrayList.add(new Orange());
        }

        Box<Apple> appleBox = new Box<>(appleArrayList);
        Box<Apple> appleBox1 = new Box<>(appleArrayList1);
        Box<Orange> orangeBox = new Box<>(orangeArrayList);
        System.out.println("Создаем ящики с фруктами : ");
        appleBox.info();
        appleBox1.info();
        orangeBox.info();

        System.out.println("Определяем вес каждого ящика : ");
        System.out.println(appleBox.name + " : вес =" + appleBox.getWeight() +
                "; кол-во= " + appleArrayList.size());
        System.out.println(appleBox1.name + " : вес = " + appleBox1.getWeight() +
                "; кол-во= " + appleArrayList1.size());
        System.out.println(orangeBox.name + " : вес = " + orangeBox.getWeight() +
                "; кол-во= " + orangeArrayList.size());

        System.out.println("Сравниваем ящики по весу : ");
        System.out.println(appleBox.name + " и " + appleBox1.name +
                " . Результат : " + appleBox.compare(appleBox1));
        System.out.println(appleBox.name + " и " + orangeBox.name +
                " . Результат : " + appleBox.compare(orangeBox));
        System.out.println(appleBox1.name + " и " + orangeBox.name +
                " . Результат : " + appleBox1.compare(orangeBox));

        System.out.println("Пересыпаем фрукты из ящика " + appleBox.name);
        appleBox.info();
        Box<?> newBox = appleBox.changeBox();
        System.out.println("Результат : ");
        appleBox.info();
        newBox.info();
        System.out.println("Пересыпаем фрукты из ящика " + appleBox1.name);
        appleBox.info();
        Box<?> newBox1 = appleBox1.changeBox();
        System.out.println("Результат : ");
        appleBox1.info();
        newBox1.info();
        System.out.println("Пересыпаем фрукты из ящика " + orangeBox.name);
        orangeBox.info();
        Box<?> newBox2 = orangeBox.changeBox();
        System.out.println("Результат : ");
        orangeBox.info();
        newBox2.info();
    }
}
