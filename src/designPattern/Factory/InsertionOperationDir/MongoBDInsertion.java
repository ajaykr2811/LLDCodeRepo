package designPattern.Factory.InsertionOperationDir;

import designPattern.Factory.InsertionOperation;

public class MongoBDInsertion implements InsertionOperation {
    @Override
    public void insert() {
        System.out.println("MongoDB insertion insertion");
    }
}
