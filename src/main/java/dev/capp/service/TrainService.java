package dev.capp.service;


import dev.capp.model.Train;
import dev.capp.repository.TrainRepository;
import org.springframework.stereotype.Service;

/*import java.util.ArrayList;*/
import java.util.List;
import java.util.Optional;

@Service
public class TrainService implements CrudService<Train> {

   /* private List<Train> trains;*/
    private TrainRepository repository;

    public TrainService(TrainRepository trainRepository) {
        /* (1) trains = new ArrayList<>();
        Train firstTrain = new Train(1,
                "ItaliaTrend",
                "TI12345",
                2020);
        trains.add(firstTrain);*/

        /* (2) repository = new TrainRepository();*/
        repository = trainRepository;
    }

    @Override
    public List<Train> list() {
        return repository.findAll();
    }

    @Override
    public Train create(Train train) {
        return null;
    }

    @Override
    public Optional<Train> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Train train, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
