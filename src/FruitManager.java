//ArrayList

import java.util.ArrayList;

public class FruitManager {
    ArrayList<String> fruits;

    public FruitManager(){
        fruits = new ArrayList<>();
    }

    public void addFruits(String fruit){
        fruits.add(fruit);
    }

    public void addFruitAt(int index, String fruit){
        if(index<fruits.size()){
            fruits.add(index, fruit);
        }else{
            System.out.println("Invalid Index, Can't Add");
        }

    }
    public void removeFruit(int index){
        if(index>=0 && index<fruits.size()){
            fruits.remove(index);
        }else {
            System.out.println("Invalid index for removal");
        }
    }

    public void replaceFruit(int index, String nextFruit){
        if(index>=0 && index<fruits.size() ){
            fruits.set(index,nextFruit);
        }else {
            System.out.println("Invalid index for replacement");
        }

    }

    public void display(){
        for(String fruit : fruits) {
            System.out.print(fruit + ",");
        }
        System.out.println();
        System.out.println("Size: "+fruits.size());
    }
}
