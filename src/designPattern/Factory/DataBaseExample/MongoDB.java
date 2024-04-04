package designPattern.Factory.DataBaseExample;

import designPattern.Factory.DataBaseExample.factoryDir.MongoDBFactory;

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
