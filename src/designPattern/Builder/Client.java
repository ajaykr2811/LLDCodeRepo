package designPattern.Builder;

public class Client {
    public static void main(String[] args) {
        Student st = Student.builder()
                .setName("RandomPersonName")
                .setAge(99)
                .setPsp(90)
                .setBatch("Morning 9:00")
                .build();

        System.out.print(st.toString());
    }
}
