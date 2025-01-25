package dev.capp.repository;

import dev.capp.model.Train;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TrainRepository implements CrudRepository<Train> {

    @Override
    public List<Train> findAll() {
        List<Train> trains = new ArrayList<>();
        Train firstTrain = new Train(1,
                "ItaliaTrend",
                "TI12345",
                2020);
        trains.add(firstTrain);
        return trains;
    }
}
