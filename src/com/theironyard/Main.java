package com.theironyard;

import spark.ModelAndView;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;

import java.util.HashMap;

// route: particular end point
// GET: route returns html
// POST: route modify the server / anything that modifies data on a server i.e create a new message

public class Main {

    static User user;

    public static void main(String[] args) {
        Spark.init();
        Spark.get(
                "/",
                (request, response) -> {
                    HashMap map = new HashMap();
                    map.put("name", "Erik");
                    return new ModelAndView(map, "home.html");
                },
                new MustacheTemplateEngine()
        );
    }
}
