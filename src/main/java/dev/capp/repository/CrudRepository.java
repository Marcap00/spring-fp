package dev.capp.repository;

import java.util.List;

public interface CrudRepository<Type> {
    List<Type> findAll();
}
