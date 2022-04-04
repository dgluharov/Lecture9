package com.company.HomeworkPerson;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob", 22, 1000, "Alpha");
        Employee employee2 = new Employee("Rob", 30, 1500, "Beta");
        Employee employee3 = new Employee("Gosh", 34, 1700, "Gama");
        String[] teams = {"Alpha", "Beta", "Gama"};
        Manager manager = new Manager("Martin", 44, teams);
        System.out.println(manager.getAllManagedTeams());

        Person[] people = new Person[4];
        people[0] = employee1;
        people[1] = employee2;
        people[2] = employee3;
        people[3] = manager;

        System.out.println(getAverageAgeInCompany(people));

        CEO ceo = new CEO("Tedy", 45);
        CEO ceo1 = new CEO("Tedy", 52);

    }

    public static double getAverageAgeInCompany(Person[] people) {
        double ageSum = 0;
        for (int i = 0; i < people.length; i++) {
            ageSum += people[i].getAge();
        }
        return ageSum / people.length;
    }
}
