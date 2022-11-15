package lesson7;

import java.util.Arrays;
import java.util.Random;

public class Cat {


    private String name;
    private boolean hungry = false;
    private int catEatFoodCount = new Random().nextInt(4, 8);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public int getCatEatFoodCount() {
        return catEatFoodCount;
    }

    public void setCatEatFoodCount(int catEatFoodCount) {
        this.catEatFoodCount = catEatFoodCount;
    }




    public Cat(String name, boolean hungry) {

        this.name = name;
        this.hungry = hungry;
    }


    public void eat(Plate plate) {
        plate.decreaseFood(catEatFoodCount);
        System.out.printf("Котик %s съел %s корма %n", name, catEatFoodCount);
        this.hungry = true;
        System.out.printf("Котик %s сыт%n", name);


    }


    public boolean hungry() {
        return isHungry()==true;
    }


    public void catInfo() {
        System.out.printf("Сытость котика %s = %s%n", name, hungry());
    }
}

