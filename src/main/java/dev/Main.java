package dev.Michael21Official;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<MenuPosition> menu = MenuReaderWriter.readMenu("D:\\Praca\\JAVA\\RESTAURACJA__MM\\src\\main\\resources\\menu.json");
        Restaurant restaurant = MenuReaderWriter.readRestaurant("D:\\Praca\\JAVA\\RESTAURACJA__MM\\src\\main\\resources\\restaurant.json");
        Order order = RestaurantService.createOrder(menu.subList(0, 2)); // create an order for the first two menu items
        RestaurantService.processOrder(restaurant, order);
        MenuReaderWriter.writeRestaurant("restaurant.json", restaurant);
        System.out.println("Current order count: " + restaurant.getCurrentOrderCount());
        System.out.println("Day's total earnings: " + restaurant.getDaySalary());
    }
}
