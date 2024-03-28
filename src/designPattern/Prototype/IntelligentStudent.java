package designPattern.Prototype;

public class IntelligentStudent extends Student{
    private int iq;
    public IntelligentStudent(IntelligentStudent student){
        super(student);
        this.setIq(student.iq);
    }
    public IntelligentStudent(){

    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public IntelligentStudent cloneObject(){
        return new IntelligentStudent(this);
    }
}
