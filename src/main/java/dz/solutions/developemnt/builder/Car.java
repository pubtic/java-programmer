package dz.solutions.developemnt.builder;

public class Car implements IBuilder{
    @Override
    public void buildBody() {
        System.out.println("car build body");
    }

    @Override
    public void insertWheels() {
        System.out.println("car insert wheels");
    }

    @Override
    public void addHeadLights() {
        System.out.println("car add headlights");
    }

    @Override
    public Product getVehicle() {
        return new Product();
    }
}
