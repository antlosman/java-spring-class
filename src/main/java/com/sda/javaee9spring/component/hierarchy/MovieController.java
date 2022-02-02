package com.sda.javaee9spring.component.hierarchy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MovieController {
    //@Autowired // field injection is allowed only in tests! use always constructors!
    // private MovieService movieService;

    private MovieService movieService;
    @Autowired // we don't need autowired because we have a constructor here
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
}
