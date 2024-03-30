package designPattern.Factory.QueryDir;

import designPattern.Factory.Query;

public class MongoDBQuery implements Query {
    @Override
    public void createQuery() {
        System.out.println("MongoDB query is created");
    }
}
