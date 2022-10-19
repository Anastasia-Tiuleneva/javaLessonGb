package lesson6;

public class Cat extends Animal{
    static int catCount;
    public Cat(int run, int swim, String name) {
        super(run, swim, name);
        catCount++;
    }


    public void run() {
        if (this.getRun() > 201 ){
            System.out.println("Кот не может пробежать более 200 м.");
        } else {
            System.out.printf("%s пробежал %s м.%n", getName(), getRun());
        }
    }

    public void swim() {
     System.out.println("Кот не умеет плавать");
    }



}

