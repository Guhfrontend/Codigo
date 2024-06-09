package Entites;

import Entites.Enums.Color;

public abstract class Shape {

    private Entites.Enums.Color color;

    public Shape(){

    }

    public Shape(Color color) {
        this.color = color;
    }

    public Entites.Enums.Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public  double area(){
        return 0;
    }
}
