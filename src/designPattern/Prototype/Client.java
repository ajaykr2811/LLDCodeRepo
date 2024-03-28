package designPattern.Prototype;

import designPattern.Prototype.Student;

public class Client {
    public static void makeRegister(StudentRegistry studentRegistry){
        Student jan = new Student();
        jan.setPsp(91.0);
        jan.setTime("Morning 9:00");
        jan.setBatch(Batches.January);
        studentRegistry.register(Batches.January,jan);

        Student feb = new Student();
        feb.setPsp(92.0);
        feb.setTime("Afternoon 1:00");
        feb.setBatch(Batches.February);
        studentRegistry.register(Batches.February,feb);

        Student mar = new Student();
        mar.setPsp(93.0);
        mar.setTime("Evening 6:00");
        mar.setBatch(Batches.March);
        studentRegistry.register(Batches.March,mar);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        makeRegister(studentRegistry);

        Student karan = studentRegistry.get(Batches.January).cloneObject();
        karan.setName("Karan");
        karan.setAge(25);

        System.out.println("Debug");
    }
}
