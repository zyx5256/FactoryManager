package model;

import java.sql.Time;
import java.util.List;
import java.util.UUID;

public abstract class Transaction {
    private UUID uuid;
    private Time time;
    private double totalPrice = -1;
    private List<CommodityPack> commodityPacks;

    public final double getTotalPrice() {
        if (totalPrice >= 0) {
            return totalPrice;
        }
        for (CommodityPack commodityPack : commodityPacks) {
            totalPrice += commodityPack.getTotalPrice();
        }
        return totalPrice;
    }
}
