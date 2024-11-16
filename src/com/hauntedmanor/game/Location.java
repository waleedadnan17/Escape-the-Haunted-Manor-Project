package com.hauntedmanor.game;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Location {
    private String locationName;
    private String description;
    private Map<String, Location> exits;
    private List<Item> items;
    private Spirit spirit;

    public Location(String name, String description) {
        this.locationName = name;
        this.description = description;
        this.exits = new HashMap<>();
        this.items = new ArrayList<>();
    }


}



