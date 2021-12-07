package SampleGroup;

import java.util.ArrayList;
import java.util.List;

public class Kia implements Company {

    private List<Car> carList;

    public Kia() {
        this.carList = new ArrayList<>();
    }

    @Override
    public void create(Car car) {
        if (car.getCompanyCode() == 2) {
            carList.add(car);
        }

    }

    @Override
    public void disposal(Car car) {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getCompanyCode() == car.getCompanyCode()) {
                carList.remove(i);
            }
        }
    }

    @Override
    public void getCarList() {
        System.out.println(carList);
    }

}
