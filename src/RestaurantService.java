package com.company;

import java.util.ArrayList;
import java.util.List;

public class RestaurantService {

    public static List<MenuPosition> creteMenu(){
        List<MenuPosition> menuPositionList = new ArrayList<>();

        menuPositionList.add(new MenuPosition("Spaghetti", "With cheese", 16.22));
        menuPositionList.add(new MenuPosition("Pizza", "With cheese", 14.22));
        menuPositionList.add(new MenuPosition("Macaron", "With cheese", 12.22));

        return menuPositionList;
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

