package SampleGroup;

public class Car {

    private int companyCode;
    private String name;
    private String color;

    public Car(int companyCode, String name, String color) {
        this.companyCode = companyCode;
        this.name = name;
        this.color = color;
    }

    public int getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(int companyCode) {
        this.companyCode = companyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
            "companyCode=" + companyCode +
            ", name='" + name + '\'' +
            ", color='" + color + '\'' +
            '}';
    }

}
