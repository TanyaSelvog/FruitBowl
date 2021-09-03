package model;

public class Orange extends Fruit{

    private int juicy;

    public Orange(int id, String name, String color, int tasty, int juiciness) {
        super(id, name, color, tasty);
        this.juicy = juiciness;
    }

    public int getJuicy(){
        return juicy;
    }
}
