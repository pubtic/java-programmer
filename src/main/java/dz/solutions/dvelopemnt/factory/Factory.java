package dz.solutions.dvelopemnt.factory;

public class Factory implements IAnimalFactory {
    @Override
    public IAnimal getAnimal(AnimalType type) throws NoAnimalTypeException {
        switch(type) {
            case DUCK:
                return new Duck();
            case TIGER:
                return new Tiger();
            default:
                throw new NoAnimalTypeException("Animal Type not found");
        }
    }
}
