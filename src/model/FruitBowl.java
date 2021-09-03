package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class FruitBowl {

    private static ObservableList<Fruit> theBowl = FXCollections.observableArrayList();

    public static void addFruit(Fruit fruit){
        theBowl.add(fruit);
    }

    public static ObservableList<Fruit> getTheBowl(){
        return theBowl;
    }



}
