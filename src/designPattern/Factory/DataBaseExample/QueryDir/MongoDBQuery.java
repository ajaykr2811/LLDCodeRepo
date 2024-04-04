package designPattern.Factory.DataBaseExample.QueryDir;

import designPattern.Factory.DataBaseExample.Query;

public class MongoDBQuery implements Query {
    @Override
    public void createQuery() {
        System.out.println("MongoDB query is created");
    }
}
