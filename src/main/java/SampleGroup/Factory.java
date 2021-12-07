package SampleGroup;

public class Factory {

    private final Company company;

    public Factory(Company company) {
        this.company = company;
    }

    public void setCompanyCarList(Car car) {
        this.company.create(car);
    }


    public static void main(String[] args) {

        Factory factory = new Factory(new Samsung());

        factory.setCompanyCarList(new Car(1, "1", "2"));
        factory.company.getCarList();


    }

}
