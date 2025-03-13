package com.inserta.cat_api.controller;

import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@RestController
public class HomeController {
    private final RequestMappingHandlerMapping handlerMapping;

    public HomeController(RequestMappingHandlerMapping handlerMapping) {
        this.handlerMapping = handlerMapping;
    }

     
    @GetMapping("/")
    public String home() {
        String html = "<!DOCTYPE html>\n" +
                      "<html>\n" +
                      "<head>\n" +
                      "    <title>Rutas Disponibles</title>\n" +
                      "    <style>\n" +
                      "        body {\n" +
                      "            font-family: Arial, sans-serif;\n" +
                      "            margin: 20px;\n" +
                      "            background-image: url('https://es.rollingstone.com/wp-content/uploads/2024/05/Critica-La-guerra-de-las-galaxias-episodio-I-La-amenaza-fantasma-Star-Wars-Episode-I-The-Phantom-Menace.jpg'); /* Cambia esta URL por una imagen válida */\n" +
                      "            background-size: cover;\n" +
                      "            background-repeat: no-repeat;\n" +
                      "            background-attachment: fixed;\n" +
                      "            color: #fff;\n" +

                      "        }\n" +
                      "        h1 {\n" +
                      "            color: #fff;\n" +
                      "        }\n" +
                      "        ul {\n" +
                      "            list-style-type: none;\n" +
                      "            padding: 0;\n" +
                      "        }\n" +
                      "        li {\n" +
                      "            background-color: rgba(0, 0, 0, 0.5);\n" +
                      "            margin: 5px 0;\n" +
                      "            padding: 10px;\n" +
                      "            border-radius: 5px;\n" +
                      "            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n" +
                      "        }\n" +
                      "    </style>\n" +
                      "</head>\n" +
                      "<body>\n" +
                      "    <h1>Rutas Disponibles</h1>\n" +
                      "    <ul>\n";
    
                      html += handlerMapping.getHandlerMethods().keySet()
                      .stream()
                      .map(t -> {
                          String descripcion = generarDescripcion(t); // Lógica para obtener descripción
                          return "        <li><strong>" + t.toString() + ":</strong> " + descripcion + "</li>\n";
                      })
                      .collect(Collectors.joining());

    
        html += "    </ul>\n" +
                "</body>\n" +
                "</html>";
    
        return html;
    }

    private String generarDescripcion(Object t) {
        String action = t.toString();

            if (action.contains("GET")) {
                return "GET, obtiene recursos.";
            } else if (action.contains("POST")) {
                return "POST, añade recursos.";
            } else if (action.contains("DELETE")) {
                return "DELETE, elimina.";
            } else if (action.contains("PUT")) {
                return "PUT, updatea algo";
            } else if (action.contains("error")) {
                return "error";
            } else {
                return "Descripción no disponible.";
            }
    }
    
    
}
