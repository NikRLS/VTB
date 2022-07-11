package lesson_3.home_work_1;

public class MyArrayDataException1 extends Exception{
    public int row;
    public int colume;


    MyArrayDataException1(int i, int j){
        super("Неверные данные лежат в ячейке массива[ " + (i+1) + " ] [ " + (j+1) + " ]");
        row = i;
        colume = j;
    }
}
