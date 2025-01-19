package org.example;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ShapeService {
    private final RectangleRepository shapeRepository;
    public ShapeService(RectangleRepository shapeRepository)
    {
        this.shapeRepository = shapeRepository;
    }
    public Rectangle saveShape(Rectangle shape)
    {
        return shapeRepository.save(shape);
    }
    public List<Rectangle> getAllShapes() {
        return shapeRepository.findAll();
    }
}
