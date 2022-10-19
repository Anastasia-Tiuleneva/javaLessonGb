package lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[]empArr = new Employee[5];
        empArr[0] = new Employee("Иванов Иван Иванович", "Директор", "ivan@mail.ru", "44-55-66", 100000, 55);
        empArr[1] = new Employee("Петров Петр Петрович", "Менеджер", "petr@mail.ru", "55-44-66", 50000, 32);
        empArr[2] = new Employee("Смирнов Евгений Николаевич", "Секретарь", "smirn@mail.ru", "65-99-60", 30000, 50);
        empArr[3] = new Employee("Иванова Екатерина Михайловна", "Бухгалтер", "ekat@mail.ru", "78-73-63", 90000, 40);
        empArr[4] = new Employee("Андреева Ирина Вячеславовна", "Экономис", "andre@mail.ru", "09-87-64", 40000, 39);

        for (int i = 0; i < empArr.length; i++){
            if (empArr[i].getAge() > 40){
                empArr[i].empoloyeInfo();

            }
        }

    }
}
