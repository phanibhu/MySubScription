package com.project.mysubscription;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubscriptionManager {
    private HashMap<String, Double> subscriptionDetails = new HashMap<>();

    public SubscriptionManager() {
        Subscription subscription = new Subscription();
        subscription.addSubscriptionDetails(new NewsPaper("TOI", new double[]{3, 3, 3, 3, 3, 5, 6}));
        subscription.addSubscriptionDetails(new NewsPaper("Hindu", new double[]{2.5, 2.5, 2.5, 2.5, 2.5, 4, 4}));
        subscription.addSubscriptionDetails(new NewsPaper("ET", new double[]{4, 4, 4, 4, 4, 4, 10}));
        subscription.addSubscriptionDetails(new NewsPaper("BM", new double[]{1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5}));
        subscription.addSubscriptionDetails(new NewsPaper("HT", new double[]{2, 2, 2, 2, 2, 4, 4}));
        subscriptionDetails = subscription.getSubscriptionDetails();
    }

    public HashMap<String, Double> getSubscriptionDetails() {
        return subscriptionDetails;
    }

    public ArrayList<ArrayList<String>> getCombinations(int budget){
        ArrayList<ArrayList<String>> combinations =new ArrayList<>();
        String[] names = new String[subscriptionDetails.size()];
        double[] price = new double[subscriptionDetails.size()];
        int index = 0;
        for (Map.Entry<String, Double> mapEntry : subscriptionDetails.entrySet()) {
            names[index] = mapEntry.getKey();
            price[index] = mapEntry.getValue();
            index++;
        }
        for(int i = 0;i<price.length;i++){
            for(int j= i+1;j<price.length;j++){
                if(price[i]+price[j]<=budget){
                    ArrayList<String> currentCombination = new ArrayList<>();
                    currentCombination.add(names[i]);
                    currentCombination.add(names[j]);
                    combinations.add(currentCombination);

                }
            }
        }
        return combinations;


    }
}




