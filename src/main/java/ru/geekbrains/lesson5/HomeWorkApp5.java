package ru.geekbrains.lesson5;


public class HomeWorkApp5 {


    public static void main(String[] args) {
        Person[] persComp = new Person[5];
        persComp[0] = new Person("Petrov Petr", "Constructor", "petr@mail.ru", "89998887766", 60000, 44);
        persComp[1] = new Person("Ivanov Ivan", "Engineer", "ivan@mail.ru", "89997776655", 55000, 41);
        persComp[2] = new Person("Bruce Lee", "Coach", "lee@mail.cn", "89996665544", 30000, 27);
        persComp[3] = new Person("Steve Jobs", "Programmer", "sj@mail.us", "89995554433", 35000, 40);
        persComp[4] = new Person("Pavel Durov","Administration", "durov@mail.ru", "89994443322", 31500,33);

        for (Person person : persComp)
            if (person.getAge()>40)
                System.out.println(person);
    }
}
class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String toString() {
        return(name+ "\n-" + position + "\n-" + email + "\n-" + phone + "\n-" + salary + "\n-" + age);
    }
}
