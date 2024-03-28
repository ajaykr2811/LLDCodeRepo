package designPattern.Prototype;

public class Student implements ClonableObject<Student>{
    private String name;
    private int age;
    private Batches batch;
    private double psp;
    private String time;
    public Student(String name, int age, Batches batch, double ßpsp, String time) {
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.psp = psp;
        this.time = time;
    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
        this.psp = student.psp;
        this.time = student.time;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatch(Batches batch) {
        this.batch = batch;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Batches getBatch() {
        return batch;
    }

    public double getPsp() {
        return psp;
    }

    public String getTime() {
        return time;
    }

    @Override
    public Student cloneObject() {
        return new Student(this);
    }
}
