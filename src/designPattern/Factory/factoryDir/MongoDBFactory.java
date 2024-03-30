package designPattern.Factory.factoryDir;

import designPattern.Factory.DatabaseFactory;
import designPattern.Factory.InsertionOperation;
import designPattern.Factory.InsertionOperationDir.MongoBDInsertion;
import designPattern.Factory.Query;
import designPattern.Factory.QueryDir.MongoDBQuery;

public class MongoDBFactory implements DatabaseFactory {
    @Override
    public Query createQuery() {
        return new MongoDBQuery();
    }

    @Override
    public InsertionOperation insertOperation() {
        return new MongoBDInsertion();
    }
}
