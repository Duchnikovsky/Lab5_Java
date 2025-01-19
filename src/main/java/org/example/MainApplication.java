package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args){
        SpringApplication.run(MainApplication.class,args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ShapeService shapeService) {
        return args -> {
            Rectangle r1 = new Rectangle(10,5,new Color(255,255,255,255));
            Rectangle r2 = new Rectangle(25,10,new Color(120,255,75,255));

            shapeService.saveShape(r1);
            shapeService.saveShape(r2);

            shapeService.getAllShapes().forEach(rectangle -> {
                System.out.println("Rectangle ID: " + rectangle.Id);
                System.out.println("Width: " + rectangle.width);
                System.out.println("Height: " + rectangle.height);
                System.out.println("Area: " + rectangle.getArea());
            });
        };
    }
}
