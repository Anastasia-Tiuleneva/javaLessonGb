public class HomeWorkApp2 {
    public static void main (String[] args) {
        System.out.println(retRes(5,5));
        checkC(-7);
        System.out.println(retIn(-1));
        countStr ("привет", 2);
        yearS(1600);
        System.out.println(yearS(2024));

    }
        public static boolean retRes(int a, int b) {
            return  10 < a + b && a + b  <= 20;
        }

        public static void checkC (int c){
            if (c >= 0) {
                System.out.println("Положительное число");
            } else {
                System.out.println("Отрицательное число");
                }
        }

        public static boolean retIn(int a) {
            return a < 0;
        }

        public static void countStr (String a, int b)  {
            for (int i = 0; i < b; i++) {
                System.out.println(a);
            }
        }

        public static boolean yearS(int a) {
            if (a % 400 == 0){
                return true;
            } else if (a % 100 == 0) {
                return false;
            } else if (a % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }

}
