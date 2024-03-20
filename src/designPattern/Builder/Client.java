package designPattern.Builder;

public class Client {
    public static void main(String[] args) {
        Student st = Student.builder()
                .setName("Ajay")
                .setAge(27)
                .setPsp(90)
                .setBatch("Evening 9:00")
                .build();

        System.out.print(st.toString());
    }
}
