package lesson_3.home_work;

public class MyArrayDataException extends Exception{
    public int row;
    public int colume;


    MyArrayDataException(int i, int j){
        super("Неверные данные лежат в ячейке массива[ " + (i+1) + " ] [ " + (j+1) + " ]" + '\n' +
                "Расчет данных прекращен");
        row = i;
        colume = j;
    }
}
