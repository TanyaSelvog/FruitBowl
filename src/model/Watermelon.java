package model;

public class Watermelon extends Fruit{

    private boolean cut;

    public Watermelon(int id, String name, String color, int tasty, boolean cut) {
        super(id, name, color, tasty);
        this.cut = cut;
    }

    public boolean getCut(){
        return cut;
    }
}
