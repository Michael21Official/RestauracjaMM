package dev.Michael21Official;

public class MenuPosition {

    private String title;
    private String desc;
    private Double price;
    

    public MenuPosition() {}

    public MenuPosition(String title, String desc, Double price) {
        this.title = title;
        this.desc = desc;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public Double getPrice() {
        return price;
    }
}
