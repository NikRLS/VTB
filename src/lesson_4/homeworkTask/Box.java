package lesson_4.homeworkTask;

import java.util.ArrayList;
import java.util.Objects;

public class Box <E extends Fruit>{
    private ArrayList<E> arrayList;
    static int count;
    String name;

    public Box(ArrayList<E> arrayList) {
        this.arrayList = arrayList;
        count++;
        name = count + " Box with " + arrayList.get(0).getClass().getSimpleName();
    }

    public float getWeight() {
        float weight = arrayList.get(0).weightOfFruit*arrayList.size();
        return weight;
    }

    public boolean compare(Box<?> another){
        return (this.getWeight() == another.getWeight());
    }

    public  Box<E> changeBox(){
        ArrayList<E> arrayList1 = new ArrayList<>(arrayList.size());
        int j = arrayList.size() -1;
        for(int i =0; i < j+1; i++){
            arrayList1.add(arrayList.get(j-i));
            arrayList.remove(j-i);
        }
        return new Box<E>(arrayList1);
    }

    public void info(){
        System.out.print(this.name + " : ");
        for(int i =0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i).toString() + ", ");
        }
        System.out.println();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(arrayList, box.arrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrayList);
    }
}
