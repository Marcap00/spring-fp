package dev.capp.repository;

import dev.capp.model.Train;

import java.util.List;

public class CourseRepository implements CrudRepository<Train> {

    @Override
    public List<Train> findAll() {
        return null;
    }
}
