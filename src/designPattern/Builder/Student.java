package designPattern.Builder;

public class Student {
    public String name;
    public int age;
    public int psp;
    public String batch;
    static Builder builder = null;

    private Student(){}

    static Builder builder(){
        return new Builder();
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

            Student st = new Student();
            st.age = this.age;
            st.name = this.name;
            st.psp = this.psp;
            st.batch = this.batch;
            return st;
        }
    }
}
