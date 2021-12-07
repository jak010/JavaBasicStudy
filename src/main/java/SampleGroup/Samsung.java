package SampleGroup;

import java.util.ArrayList;
import java.util.List;

public class Samsung implements Company {

    private List<Car> carList;

    public Samsung() {
        this.carList = new ArrayList<>();
    }

    @Override
    public void create(Car car) {
        if (car.getCompanyCode() == 1) {
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
