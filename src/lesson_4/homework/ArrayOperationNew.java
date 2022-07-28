package lesson_4.homework;

import java.util.ArrayList;

public class ArrayOperationNew <T>{
    public static void main(String[] args) {
        Integer[] intarr =  new Integer[] {1,2,3,4,5,6,7,8};
        String[] strarr = new String[] {"A","B","C",
               "D","E","F","G","H"};

        new ArrayOperationNew().change1(intarr,2,4 );
        new ArrayOperationNew().change1(strarr,3,6);
        new ArrayOperationNew<>().changeArrayToArrayList1(intarr);
        new ArrayOperationNew<>().changeArrayToArrayList1(strarr);

    }

    public void change1(T[] arr, int i, int j){
        for (T a : arr){
            System.out.print(a + ", ");
        }
        System.out.println();

        Object c;
        c = arr[i];
        arr[i] = arr[j];
        arr[j] = (T) c;

        for (T a : arr){
            System.out.print(a + ", ");
        }
        System.out.println();
    }

    public void changeArrayToArrayList1(T[] array) {
        ArrayList<T> arrayList = new ArrayList<>(array.length);
        for (int i = 0; i < array.length; i++) {
            arrayList.add(i, (T) array[i]);
        }
        System.out.println(arrayList.toString());
    }
}
