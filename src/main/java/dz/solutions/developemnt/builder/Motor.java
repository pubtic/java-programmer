package dz.solutions.developemnt.builder;

public class Motor implements IBuilder{
    @Override
    public void buildBody() {
        System.out.println("motor build body");
    }

    @Override
    public void insertWheels() {
        System.out.println("motor insert wheels");
    }

    @Override
    public void addHeadLights() {
        System.out.println("motor add headlights");
    }

    @Override
    public Product getVehicle() {
        return null;
    }
}
