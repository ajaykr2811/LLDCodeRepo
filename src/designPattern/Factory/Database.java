package designPattern.Factory;

public interface Database {
    void refresh();
    void theme();

    DatabaseFactory factory();
}
