package CreationalDesignPatterns.FactoryDesingPattern;

public class ShapeFactory {

    public Shape getShape(String type){
        switch (type){
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }

}
