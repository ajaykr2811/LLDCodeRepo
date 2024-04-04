package designPattern.Factory.DataBaseExample;

public class client {
    public static void main(String[] args) {
        Database mysql = new MySql();
        DatabaseFactory df = mysql.factory();

        df.createQuery().createQuery();
        df.insertOperation().insert();


        System.out.println("DEBUG");
    }
}
