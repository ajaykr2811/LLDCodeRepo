package designPattern.Factory.DataBaseExample.InsertionOperationDir;

import designPattern.Factory.DataBaseExample.InsertionOperation;

public class MySQLInsertion implements InsertionOperation {
    @Override
    public void insert() {
        System.out.println("MySQL insertion operation");
    }
}
