package lesson6;

public abstract class Animal {

    private String name;
    private int run;
    private int swim;

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }

    public Animal(int run, int swim, String name) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public abstract void run();
    public abstract void swim();

}



