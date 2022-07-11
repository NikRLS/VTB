package lesson_3.home_work_1;

    public class HomeWorkMain1 {

        public static void main(String[] args) {
            String[][] strings = {{"1","2","3","4"},
                                  {"5","6","7","8"},
                                  {"9","10","11","12"},
                                  {"19","110","111","112"},
                                  {"13","14","15","16"}};

            int sumMethod = 0;
            boolean fullSum = true;

            try {
                if (strings.length != 4 || strings[0].length !=4) {
                    throw new MyArraySizeException1();
                }
            } catch (MyArraySizeException1 e){
                System.out.println("Размер массива не соответствует 4 на 4");
                e.printStackTrace();
            }

            try {
                sumMethod = method(strings);

            } catch (MyArrayDataException1 e){
                System.out.println(e.getMessage());
                e.printStackTrace();
                fullSum = false;
            }

            if(fullSum == false){
                System.out.println("Расчет данных прекращен");
            }else {
                System.out.println("Сумма равна " + sumMethod);
            }

        }

        public static int method(String[][] strings) throws MyArrayDataException1 {

            int sumStrings = 0;
            boolean nFE = false;

            for (int i=0; i < strings.length; i++){
                for (int j=0; j < strings[0].length; j++) {
                    try {
                        sumStrings += Integer.valueOf(strings[i][j]);
                    } catch (NumberFormatException e) {
                        nFE = true;
                    }
                    if (nFE == true) {
                        throw new MyArrayDataException1(i, j);
                    }
                }
            }
            return sumStrings;

        }
    }

