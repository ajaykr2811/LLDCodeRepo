package designPattern.Prototype;
import designPattern.Prototype.Batches;
import designPattern.Prototype.Student;
import java.util.HashMap;

public class StudentRegistry implements Prototype<Student,Batches>{
    private HashMap<Batches,Student> res = new HashMap<>();
    @Override
    public void register(Batches batch, Student student) {
        res.put(batch,student);
    }

    @Override
    public Student get(Batches batch) {
        return res.get(batch);
    }

    @Override
    public Student clone(Batches batch) {
        return res.get(batch).cloneObject();
    }
}
