package designPattern.Factory.factoryDir;

import designPattern.Factory.DatabaseFactory;
import designPattern.Factory.InsertionOperation;
import designPattern.Factory.InsertionOperationDir.MySQLInsertion;
import designPattern.Factory.Query;
import designPattern.Factory.QueryDir.MySQLQuery;

public class MysqlDatabaseFactory implements DatabaseFactory {
    @Override
    public Query createQuery() {
        return new MySQLQuery();
    }

    @Override
    public InsertionOperation insertOperation() {
        return new MySQLInsertion();
    }
}
