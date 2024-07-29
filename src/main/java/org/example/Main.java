package org.example;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivanov@mailbox.com", "84615464", 70000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "892312313", 50000, 35);
        employees[2] = new Employee("Sidorov Sidr", "Director", "sidorov@mailbox.com", "892312314", 100000, 40);
        employees[3] = new Employee("Smirnov Smirnyaga", "Developer", "smirnov@mailbox.com", "892312315", 80000, 25);
        employees[4] = new Employee("Kuznetsov Kuzya", "Designer", "kuznetsov@mailbox.com", "892312316", 60000, 28);

        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println();
        }
    }
}

