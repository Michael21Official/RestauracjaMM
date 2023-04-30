package dev.Michael21Official;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MenuReaderWriter {

    public static List<MenuPosition> readMenu(String filename) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(filename);
        List<MenuPosition> menu = mapper.readValue(file, new TypeReference<List<MenuPosition>>() {});
        return menu;
    }

    public static void writeMenu(String filename, List<MenuPosition> menu) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(filename);
        mapper.writeValue(file, menu);
    }
    public static Restaurant readRestaurant(String filename) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(filename);
        Restaurant restaurant = mapper.readValue(file, Restaurant.class);
        return restaurant;
    }

    public static void writeRestaurant(String filename, Restaurant restaurant) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(filename);
        mapper.writeValue(file, restaurant);
    }

}
