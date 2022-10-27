package DesignPatterns.ProductionBuilder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();
//        builder.setAge(12);
//        builder.setName("Ayush");
//        builder.setGradYear(2020);

        Student st1 = Student.getBuilder()
                        .setAge(12)
                        .setName("Ayush")
                        .setGradYear(2021)
                        .build();

        System.out.println("DEBUG");
    }

}
