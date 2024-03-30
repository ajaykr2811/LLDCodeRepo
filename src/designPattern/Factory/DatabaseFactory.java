package designPattern.Factory;

public interface DatabaseFactory {
    Query createQuery();
    InsertionOperation insertOperation();
}
