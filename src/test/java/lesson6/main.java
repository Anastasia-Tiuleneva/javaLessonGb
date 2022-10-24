package lesson6;

public class main {
    public static void main(String[] args) {
        Dog dog1 = new Dog(500, 10, "Бобик");
        Dog dog2 = new Dog(501, 11, "Шурик");
        Dog dog3 = new Dog(50, 5, "Тотошка");
        Dog dog4 = new Dog(10, 8, "Барс");
        Cat cat1 = new Cat (200,1, "Мурка");
        Cat cat2 = new Cat (200,1, "Журка");
        dog1.run();
        dog1.swim();
        dog2.run();
        dog2.swim();
        dog3.run();
        dog3.swim();
        cat1.run();
        cat1.swim();
        cat2.run();
        cat2.swim();
        System.out.println(Cat.catCount);
        System.out.println(Dog.dogCount);


    }
}
