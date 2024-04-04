package designPattern.Factory.DataBaseExample;

import designPattern.Factory.DataBaseExample.factoryDir.MysqlDatabaseFactory;

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
