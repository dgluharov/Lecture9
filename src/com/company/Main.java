package com.company;

import com.company.GeometeryFigure.GeometryFigure;
import com.company.Person.Person;
import com.company.Person.Student;
import com.company.Person.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*GeometryFigure circle = new Circle(1);
        GeometryFigure rectangle = new Rectangle(4, 5);
        GeometryFigure rectangle2 = new Rectangle(5, 6);

        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());

        GeometryFigure[] figures = {circle, rectangle, rectangle2};

        double maxArea = findMaxArea(figures);

        System.out.println(maxArea);
*/

        Person teacher = new Teacher("Ivan", 44, 185, new String[]{"History"});
        Person student1 = new Student("Kiril", 16, 175, new String[]{"History", "Math", "English"});
        Person student2 = new Student("Georgi", 14, 165, new String[]{"Math, Art"});
        Person student3 = new Student("Georgi", 7, 195, new String[]{"Math"});

        List<Person> personArrayList = new ArrayList<>();
        personArrayList.add(teacher);
        personArrayList.add(student1);
        personArrayList.add(student2);
        personArrayList.add(student3);

        System.out.println(getAverageAge(personArrayList));

        System.out.println(Person.count);
    }


    public static double getAverageAge(List<Person> personList) {
        int delimiter = personList.size();
        double sumAge = 0;

        for (Person person : personList) {
            sumAge += person.getAge();
        }
        return sumAge / delimiter;
    }

    private static double findMaxArea(GeometryFigure[] figures) {
        double maxArea = 0;

        for (int i = 0; i < figures.length; i++) {
            if (figures[i] != null && maxArea < figures[i].getArea()) {
                maxArea = figures[i].getArea();
            }
        }
        return maxArea;
    }
}
