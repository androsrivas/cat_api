package com.inserta.cat_api.controller;

import com.inserta.cat_api.entity.Gato;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class RestApiController {

    List<Gato> catsList;

    @PostConstruct
    public void loadData() {
        catsList = new ArrayList<>();

        catsList.add(new Gato(
                "Felis silvestris catus",
                'C',
                "Europeo común",
                (byte) 3,
                "Europa",
                "sociable, juguetón, independiente"
        ));
        catsList.add(new Gato(
                "Felis silvestris catus",
                'C',
                "Cartujo",
                (byte) 8,
                "Turquía",
                "calmado, reservado, hogareño"
        ));
    }


    @GetMapping("/cats/{catId}")
    public Gato getCat(@PathVariable int catId) {
        for(Gato cat : catsList) {
            if(cat.getId() == catId) {
                return cat;
            }
        }
        return null;
    }


    @GetMapping("/cats")
    public List<Gato> listCats() {
        return catsList;
    }

}
