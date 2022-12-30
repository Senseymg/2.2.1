package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

public interface CarDao {
    void addCar (Car car);
   // User getCarOwner(String model,int series);
    User GetUserByCar(String model,int series);

}
