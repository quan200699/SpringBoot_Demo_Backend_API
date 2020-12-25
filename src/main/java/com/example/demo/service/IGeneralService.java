package com.example.demo.service;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> getAll();

    T save(T t);

    Optional<T> findById(Long id);

    void remove(Long id);
}
