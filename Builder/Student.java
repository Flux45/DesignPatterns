package DesignPatterns.Builder;

public class Student {
    String name;
    int age;
    double psp;
    String universityName;
    String batch;
    long id;
    int gradYear;
    String phoneNumber;

    //Student(String name,int age,String universityName,....)
    Student(Builder builder){
        // validate
        if(builder.getGradYear() > 2022){
            throw new IllegalArgumentException("Grad year cannot be greater that 2022");
        }

        this.gradYear = builder.getGradYear();
        this.age = builder.getAge();
        this.name = builder.getName();
    }
}
