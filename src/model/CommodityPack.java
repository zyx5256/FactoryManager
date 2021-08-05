package model;


/**
 *
 *
 * */
public abstract class CommodityPack {
    private String name;
    private String description;
    private double price;
    private double amount; // some commodities are measured by weight

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(String description) {
        this.description = description;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        this.price = price;
    }

    public final double getAmount() {
        return amount;
    }

    public final void setAmount(double amount) {
        this.amount = amount;
    }

    public final double getTotalPrice() {
        return amount * price;
    }

    public abstract String toString();
}
