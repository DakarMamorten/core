package com.vlad.web.dvdrental.dao;

import java.util.List;

public interface AbstractDAO<T> {
    List<T> findAll();

    T findById(Long id);

    void deleteById(Long id);

    void save(T entity);

}
