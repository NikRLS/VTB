package lesson_3.home_work;

    public class HomeWorkMain {

        public static void main(String[] args) {
            String[][] strings = {{"1","2","3","4"},
                                  {"5","--","7","8"},
                                  {"9","10","11","12"},
                                  {"19","110","111","112"},
                                  {"13","14","15","16"}};

            int sumOfArray = 0;

            try {
                if (strings.length != 4 || strings[0].length !=4) {
                    throw new MyArraySizeException();
                }
            } catch (MyArraySizeException e){
                System.out.println("Размер массива не соответствует 4 на 4");
                e.printStackTrace();
            }

            try {
                sumOfArray = myMethod(strings);

            } catch (MyArrayDataException e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

            System.out.println("Сумма равна " + sumOfArray);
        }

        public static int myMethod(String[][] strings) throws MyArrayDataException {
            int sumStrings = 0;

            for (int i=0; i < strings.length; i++){
                for (int j=0; j < strings[0].length; j++) {
                    try {
                        sumStrings += Integer.valueOf(strings[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
            return sumStrings;

        }
    }

