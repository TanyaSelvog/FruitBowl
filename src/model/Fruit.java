package model;

public abstract class Fruit {
    private int id;
    private String name;
    private String color;
    private int tasty;

    public Fruit (int id, String name, String color, int tasty){
        this.id = id;
        this.name = name;
        this.color = color;
        this.tasty = tasty;
    }

    public int getId(){
        return id;

    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public int getTasty(){
        return tasty;
    }
}
