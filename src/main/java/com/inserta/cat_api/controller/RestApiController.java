package com.inserta.cat_api.controller;

import com.inserta.cat_api.entity.Gato;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/cats")
    public List<Gato> listCats() {
        return catsList;
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

    @PostMapping
    public Gato addCat(@RequestBody Gato cat) {
        catsList.add(cat);

        return cat;
    }

    @PutMapping("/cats/{catId}")
    public Gato updateCat(@RequestBody Gato newCat) {
        for(Gato cat: catsList) {
            if(cat.getId() == cat.getId()) {
                cat.setRaza(newCat.getRaza());
                cat.setEdad(newCat.getEdad());
                cat.setOrigen(newCat.getOrigen());
                cat.setTemperamento(newCat.getTemperamento());
            }
        }

        return newCat;
    }

    @DeleteMapping("/cats/{catId}")
    public String deleteCat(@PathVariable int catId) {
        this.catsList.removeIf(c -> c.getId() == catId);

        return "Borrado el gato: " + catId;
    }


}
