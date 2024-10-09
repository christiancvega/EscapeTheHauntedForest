package com.ps;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.HashMap;

public class Location {
    private String name;
    private String description;
    private Map<String,Location> exits;

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
        this.exits = new HashMap<>();
    }

    public void addExit(String direction, Location location){
        exits.put(direction, location);
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Location> getExits() {
        return exits;
    }

    public String getName() {
        return name;
    }

    public void describe() {
        System.out.println("Location: " + name);
        System.out.println("Description: " + description);
    }




}
