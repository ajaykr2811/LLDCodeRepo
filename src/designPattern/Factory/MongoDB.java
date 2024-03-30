package designPattern.Factory;

import designPattern.Factory.InsertionOperationDir.MongoBDInsertion;
import designPattern.Factory.QueryDir.MongoDBQuery;
import designPattern.Factory.factoryDir.MongoDBFactory;
import designPattern.Factory.factoryDir.MysqlDatabaseFactory;

public class MongoDB implements Database{
    @Override
    public void refresh() {
        System.out.println("MongoDB refresh");
    }

    @Override
    public void theme() {
        System.out.println("MongoDb Blue theme");
    }

    @Override
    public DatabaseFactory factory() {
        return new MongoDBFactory();
    }

}
