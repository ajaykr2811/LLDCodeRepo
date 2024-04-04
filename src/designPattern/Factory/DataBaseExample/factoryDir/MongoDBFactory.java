package designPattern.Factory.DataBaseExample.factoryDir;

import designPattern.Factory.DataBaseExample.DatabaseFactory;
import designPattern.Factory.DataBaseExample.InsertionOperation;
import designPattern.Factory.DataBaseExample.InsertionOperationDir.MongoBDInsertion;
import designPattern.Factory.DataBaseExample.Query;
import designPattern.Factory.DataBaseExample.QueryDir.MongoDBQuery;

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
