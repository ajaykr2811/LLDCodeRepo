package designPattern.Factory.QueryDir;

import designPattern.Factory.Query;

public class MySQLQuery implements Query {
    @Override
    public void createQuery() {
        System.out.println("MySQl query created");
    }
}
