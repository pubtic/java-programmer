package dz.solutions.developemnt.builder;

public interface IBuilder {

    void buildBody();
    void insertWheels();
    void addHeadLights();
    Product getVehicle();

}
