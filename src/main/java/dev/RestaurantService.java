package dev.Michael21Official;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RestaurantService {

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





    public static List<MenuPosition> createMenu() throws IOException {
        return MenuReaderWriter.readMenu("menu.json");
    }


    public static Order createOrder(List<MenuPosition> menuPositionList){
        return new Order(menuPositionList);
    }

    public static void processOrder(Restaurant restaurant, Order order) {

        restaurant.setCurrentOrderCount(restaurant.getCurrentOrderCount()+1);

        double currentRestaurantSalary =  restaurant.getDaySalary();
        restaurant.setDaySalary(currentRestaurantSalary +  countWholeOrderPayment(order.menuPositionList));
    }

    public static double countWholeOrderPayment(List<MenuPosition> menuPositionList){
        double finalePayment = 0;

        for (int i = 0; i<menuPositionList.size(); i++){
            finalePayment+=menuPositionList.get(i).getPrice();
        }

        return finalePayment;
    }
}

