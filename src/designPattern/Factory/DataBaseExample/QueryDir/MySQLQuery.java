package designPattern.Factory.DataBaseExample.QueryDir;

import designPattern.Factory.DataBaseExample.Query;

public class MySQLQuery implements Query {
    @Override
    public void createQuery() {
        System.out.println("MySQl query created");
    }
}
