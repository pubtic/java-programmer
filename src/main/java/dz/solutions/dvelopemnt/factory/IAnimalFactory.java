package dz.solutions.dvelopemnt.factory;

public interface IAnimalFactory {
    IAnimal getAnimal(AnimalType type) throws NoAnimalTypeException;
}
