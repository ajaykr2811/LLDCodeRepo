package designPattern.Factory.DataBaseExample;

public interface Database {
    void refresh();
    void theme();

    DatabaseFactory factory();
}
