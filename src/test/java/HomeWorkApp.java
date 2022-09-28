public class HomeWorkApp {
    public static void main (String[] args) {
        printThreeWords();
        checkSumSign(4,-6);
        printColor(100);
        compareNumbers(6,12);

    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b){
        int sum = a+b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");}
        if (sum < 0) {
            System.out.println("Сумма отрицательная");}
    }
    public static void printColor(int value) {
        if (value <= 0){System.out.println("Красный");}
        if (value > 0 && value <=100){System.out.println("Желтый");}
        if (value > 100){System.out.println("Зеленый");}
    }

    public static void compareNumbers(int a, int b){
        if (a >= b){System.out.println("a >= b");}
        else {System.out.println(" a < b");}
    }


}
