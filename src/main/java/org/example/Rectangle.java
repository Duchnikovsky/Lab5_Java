package org.example;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "rectangles")
public class Rectangle extends Shape {
    @Id
    public long Id;
    public double width = 0;
    public double height = 0;
    public Rectangle()
    {
        super(new Color(0,0,0));
        width = 0;
        height = 0;
        color = null;
    }
    public Rectangle(double width, double height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
        this.color = color;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}