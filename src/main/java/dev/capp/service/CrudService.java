package dev.capp.service;

import java.util.List;
import java.util.Optional;

public interface CrudService<Type> {
    List<Type> list();

    Type create(Type type);

    Optional<Type> get(int id);

    void update(Type type, int id);

    void delete(int id);
}
