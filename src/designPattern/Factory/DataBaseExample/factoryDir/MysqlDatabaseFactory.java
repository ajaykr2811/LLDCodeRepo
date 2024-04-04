package designPattern.Factory.DataBaseExample.factoryDir;

import designPattern.Factory.DataBaseExample.DatabaseFactory;
import designPattern.Factory.DataBaseExample.InsertionOperation;
import designPattern.Factory.DataBaseExample.InsertionOperationDir.MySQLInsertion;
import designPattern.Factory.DataBaseExample.Query;
import designPattern.Factory.DataBaseExample.QueryDir.MySQLQuery;

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
