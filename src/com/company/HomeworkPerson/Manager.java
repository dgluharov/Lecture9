package com.company.HomeworkPerson;

public class Manager extends Person {
    private String[] managedTeams;

    public Manager(String name, int age, String[] managedTeams) {
        super(name, age);
        this.managedTeams = managedTeams;
    }

    public String[] getManagedTeams() {
        return managedTeams;
    }

    public void setManagedTeams(String[] managedTeams) {
        this.managedTeams = managedTeams;
    }

    String getAllManagedTeams() {
        StringBuilder result = new StringBuilder();
        result.append("The managed teams are: ");
        for (int i = 0; i < this.managedTeams.length; i++) {
            if (i < this.managedTeams.length - 1) {
                result.append(this.managedTeams[i]).append(", ");
            } else {
                result.append(this.managedTeams[i]).append(".");
            }
        }
        return result.toString();
    }

    @Override
    public void jump() {
        System.out.println("Jump");
    }

    @Override
    public String toString() {
        return "This Manager is with name " + this.name +
                ", age - " + this.age;
    }
}
