package com.project.mysubscription;

import java.util.HashMap;
import java.util.List;

public class Subscription {
    private HashMap<String, Double> newspapers;


    public Subscription() {
        newspapers=new HashMap<>();


    }
    public void addSubscriptionDetails(NewsPaper newsPaper){
        newspapers.put(newsPaper.getName(),calculateTotalPrice(newsPaper.getPrice()));
    }


    public HashMap<String, Double> getSubscriptionDetails(){
        return this.newspapers;

    }


    public double calculateTotalPrice(double[] prices) {

        double totalPrice = 0;
        for(int i = 0; i<prices.length;i++){
            totalPrice+=prices[i];
        }

        return totalPrice;
    }
}
