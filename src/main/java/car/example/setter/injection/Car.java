package car.example.setter.injection;


public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void showSpecification(){
        System.out.println(specification.toString());
    }
}
