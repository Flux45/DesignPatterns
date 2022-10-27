package DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setAge(12);
        builder.setName("Ayush");
        builder.setGradYear(2020);

        Student st = new Student(builder);
        System.out.println("DEBUG");
    }

}
