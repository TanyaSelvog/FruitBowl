package controller;

import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.FruitBowl;
import model.Orange;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    public TableColumn fruitID;
    public TableColumn fruitName;
    public TableColumn colorCol;
    public TableColumn tastyCol;
    public TableView fruitTable;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



        Orange a = new Orange(1, "Orange", "pink", 40, 40);
        FruitBowl.addFruit(a);

        fruitTable.setItems(FruitBowl.getTheBowl());

        fruitID.setCellValueFactory(new PropertyValueFactory<>("id"));
        fruitName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colorCol.setCellValueFactory(new PropertyValueFactory<>("color"));
        tastyCol.setCellValueFactory(new PropertyValueFactory<>("tasty"));
        
    }
}
