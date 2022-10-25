package lesson7;




public class Test {
    public static void main(String[] args) throws InterruptedException {
        Plate plate = new Plate(15);
        plate.goFoodCount(5);
        System.out.println(plate.getFoodCount());


        Cat[] catsArr = new Cat[5];
        catsArr[0] = new Cat("Мурзик", false);
        catsArr[1] = new Cat("Тимка", false);
        catsArr[2] = new Cat("Мурка", false);
        catsArr[3] = new Cat("Рыжик", false);
        catsArr[4] = new Cat("Беляш", false);
        catsArr[1].catInfo();
        catsArr[2].catInfo();
        catsArr[3].catInfo();
        catsArr[4].catInfo();

        for (int i = 0; i < catsArr.length; i++) {
                if (plate.getFoodCount() > 0 && plate.getFoodCount() >=catsArr[i].getCatEatFoodCount() && catsArr[i].isHungry() == false) {
                    catsArr[i].eat(plate);
                    plate.printInfo();
                    Thread.sleep(1000);
                    System.out.println();
                }

            else{
                System.out.printf("Котику %s не хватает еды в миске%n", catsArr[i].getName());
            }
        }
        catsArr[1].catInfo();
        catsArr[2].catInfo();
        catsArr[3].catInfo();
        catsArr[4].catInfo();




    }
}

