package lesson7;

public class Plate {
    private int foodCount;

    public Plate(int foodCout) {
        this.foodCount = foodCout;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void printInfo() {
        System.out.printf("В миске осталось %s еды %n", foodCount);
    }

    public void decreaseFood(int catEatFoodCount) {
        foodCount -= catEatFoodCount;
        System.out.println("Объем миски уменьшился на " + catEatFoodCount);

    }

    public void goFoodCount(int count){
        foodCount += count;
    }
    }

