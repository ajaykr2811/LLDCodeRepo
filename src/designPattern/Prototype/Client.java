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

        IntelligentStudent nov = new IntelligentStudent();
        nov.setPsp(93.0);
        nov.setTime("Night 9:00");
        nov.setIq(98);
        nov.setBatch(Batches.November);
        studentRegistry.register(Batches.November,nov);

    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        makeRegister(studentRegistry);

        Student karan = studentRegistry.get(Batches.January).cloneObject();
        karan.setName("Karan");
        karan.setAge(25);

        Student koko = studentRegistry.get(Batches.November).cloneObject();

        //(Additional) if you want to set IQ later, typecase is required
        IntelligentStudent koko2 = (IntelligentStudent)koko;


        System.out.println("Debug");
    }
}
