package ExcutorService.ArrayCreator;

import java.util.concurrent.Callable;
import java.util.ArrayList;

class ArrayCreator implements Callable<ArrayList<Integer>>{
    int number;

    public ArrayCreator(int number){
        this.number = number;
    }

    @Override
    public ArrayList<Integer> call(){
        ArrayList<Integer> listCreated = new ArrayList<>();
        for(int i=1;i<=number;i++){
            listCreated.add(i);
        }
        return listCreated;
    }

}