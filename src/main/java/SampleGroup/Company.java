package SampleGroup;

import java.util.List;

public interface Company {

    List<Car> carList = null;

    /**
     * 차를 생산하다
     */
    public void create(Car car);

    /**
     * 폐기 처분하다
     */
    public void disposal(Car car);

    public void getCarList();
}


