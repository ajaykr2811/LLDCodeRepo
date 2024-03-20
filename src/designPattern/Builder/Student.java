package designPattern.Builder;

public class Student {
    String name;
    int age;
    int psp;
    String batch;

    private Student(Builder builder){
        this.name = builder.name;
        this.batch = builder.batch;
        this.age = builder.age;
        this.psp = builder.psp;
    }

    static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", batch='" + batch + '\'' +
                '}';
    }

    static class Builder{
        private String name;
        private int age;
        private int psp;
        private String batch;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setPsp(int psp){
            this.psp = psp;
            return this;
        }

        public Builder setBatch(String batch){
            this.batch = batch;
            return this;
        }

        public Student build(){
            //validation start
            if(this.age<20){
                throw new RuntimeException("Only age 20 and older allowed");
            }

            if(this.psp<80){
                throw new RuntimeException("psp must be 80 or above");
            }
            //validation ends
            return new Student(this);
        }
    }
}
