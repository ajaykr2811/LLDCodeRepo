package designPattern.Factory.DataBaseExample.InsertionOperationDir;

import designPattern.Factory.DataBaseExample.InsertionOperation;

public class MongoBDInsertion implements InsertionOperation {
    @Override
    public void insert() {
        System.out.println("MongoDB insertion insertion");
    }
}
