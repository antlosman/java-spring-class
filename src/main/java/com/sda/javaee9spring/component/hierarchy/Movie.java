package com.sda.javaee9spring.component.hierarchy;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public record Movie() {

    public List<Movie>  readAllMoviesFromDatabase() {
        return List.of();
    }
}
