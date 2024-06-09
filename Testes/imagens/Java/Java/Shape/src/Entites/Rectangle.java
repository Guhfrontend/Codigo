package Entites;

import Entites.Enums.Color;

public class Rectangle extends Shape {

    private Double widht;
    private Double height;

    public  Rectangle(){
        super();
    }
    public Rectangle(Color color, Double widht, Double height) {
        super(color);
        this.widht = widht;
        this.height = height;
    }

    public Double getWidht() {
        return widht;
    }

    public void setWidht(Double widht) {
        this.widht = widht;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    public double area(){
        return  widht* height;
    }
}
