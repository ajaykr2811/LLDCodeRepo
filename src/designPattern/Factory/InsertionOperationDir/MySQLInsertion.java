package designPattern.Factory.InsertionOperationDir;

import designPattern.Factory.InsertionOperation;

public class MySQLInsertion implements InsertionOperation {
    @Override
    public void insert() {
        System.out.println("MySQL insertion operation");
    }
}
