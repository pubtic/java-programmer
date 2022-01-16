package dz.solutions.developemnt.builder;

public class Director {

    public Product construct(IBuilder builder) {
        builder.buildBody();
        builder.insertWheels();
        builder.insertWheels();
        return builder.getVehicle();
    }
}
