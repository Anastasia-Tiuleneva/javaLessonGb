package lesson5;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;

    public int getAge() {
        return age;
    }

    private int age;

    public Employee(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    void empoloyeInfo (){
        System.out.println(String.format("Сотрудник %s работает в должности %s, рабочий email %s и рабочий телефон %sб, заработная плата %s, возвраст %s", fio, position, email, phone,salary, age));

    }





}
