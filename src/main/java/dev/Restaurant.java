package dev.Michael21Official;

import java.util.List;

public class Restaurant {

    private int currentOrderCount;

    private double daySalary;

    private List<MenuPosition> menuPositionList;

    public Restaurant(int currentOrderCount, double daySalary, List<MenuPosition> menuPositionList) {
        this.currentOrderCount = currentOrderCount;
        this.daySalary = daySalary;
        this.menuPositionList = menuPositionList;
    }

    public int getCurrentOrderCount() {
        return currentOrderCount;
    }

    public void setCurrentOrderCount(int currentOrderCount) {
        this.currentOrderCount = currentOrderCount;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public List<MenuPosition> getMenuList() {
        return menuPositionList;
    }

    public void setMenuList(List<MenuPosition> menuPositionList) {
        this.menuPositionList = menuPositionList;
    }
}
