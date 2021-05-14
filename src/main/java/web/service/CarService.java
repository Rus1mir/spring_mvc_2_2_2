package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private final int MAX_AMOUNT_PER_REQUEST = 100;
    @Autowired
    private CarDao carDao;

    public List<Car> getCars(int quantity) {
        return carDao.getCars().stream().limit(quantity).collect(Collectors.toList());
    }

    public int getMaxAmountPerReq() {
        return MAX_AMOUNT_PER_REQUEST;
    }
}
