package lesson6;

public class Dog extends Animal{
    static int dogCount;
    public Dog(int run, int swim, String name) {
        super(run, swim, name);
        dogCount++;
    }


    @Override
    public void run() {
        if (this.getRun() > 500 ){
            System.out.println("Собака не может пробежать более 500 м.");
        } else {
            System.out.printf("%s пробежал %s м.%n", getName(), getRun());
        }
    }

    public void swim() {
        if (this.getSwim() > 10 ){
            System.out.println("Собака не может проплыть более 10 м.");
        } else {
            System.out.printf("%s проплыл %s м.%n", getName(), getSwim());
        }
    }

}
