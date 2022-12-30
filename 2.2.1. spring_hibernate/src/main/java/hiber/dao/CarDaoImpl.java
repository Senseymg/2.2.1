package hiber.dao;

import hiber.model.Car;
import hiber.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCar (Car car) {
        sessionFactory.getCurrentSession().save(car);

    }
    @Override
    public User GetUserByCar(String model,int series){
        String query ="SELECT user from Car where model=model and series=series";

        Query query1 = sessionFactory.getCurrentSession().createQuery(query);
        List<User> list=query1.getResultList();
        return list.get(0);
    }

   /* @Override
    public User getCarOwner(String model, int series) {
        TypedQuery<User> query=sessionFactory.getCurrentSession().;
        return query.getResultList();
    }*/
}
