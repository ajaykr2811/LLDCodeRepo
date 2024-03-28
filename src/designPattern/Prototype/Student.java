package designPattern.Prototype;

public class Student implements ClonableObject{
    private String name;
    private int age;
    private Batches batch;
    private double psp;
    private String time;
    private int iq;
    public Student(String name, int age, Batches batch, double psp, String time,int iq) {
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.psp = psp;
        this.time = time;
        this.iq = iq;
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

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public Student cloneObject() {
        return new Student(name,age,batch,psp,time,iq);
    }
}
