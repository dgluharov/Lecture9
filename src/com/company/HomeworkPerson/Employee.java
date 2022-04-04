package com.company.HomeworkPerson;

public class Employee extends Person {

    private int salary;
    private String team;

    public Employee(String name, int age, int salary, String team) {
        super(name, age);
        this.salary = salary;
        this.team = team;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }


    @Override
    public void jump() {
        System.out.println("Jump");
    }

    @Override
    public String toString() {
        return "This Employee is with name " + this.name +
                ", age - " + this.age +
                ", salary - " + this.salary +
                ", and his team is - " + this.team;
    }
}
