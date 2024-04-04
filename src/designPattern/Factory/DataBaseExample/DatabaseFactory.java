package designPattern.Factory.DataBaseExample;

public interface DatabaseFactory {
    Query createQuery();
    InsertionOperation insertOperation();
}
