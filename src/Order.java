package com.company;

import java.util.List;

public class Order {

    List<MenuPosition> menuPositionList;

    public Order(List<MenuPosition> menuPositionList) {
        this.menuPositionList = menuPositionList;
    }
}
