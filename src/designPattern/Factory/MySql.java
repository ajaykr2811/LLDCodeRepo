package designPattern.Factory;

import designPattern.Factory.InsertionOperationDir.MySQLInsertion;
import designPattern.Factory.QueryDir.MySQLQuery;
import designPattern.Factory.factoryDir.MysqlDatabaseFactory;

public class MySql implements Database{
    @Override
    public void refresh() {
        System.out.println("My sql refresh");
    }

    @Override
    public void theme() {
        System.out.println("MySQL black theme");
    }

    @Override
    public DatabaseFactory factory() {
        return new MysqlDatabaseFactory();
    }

}
