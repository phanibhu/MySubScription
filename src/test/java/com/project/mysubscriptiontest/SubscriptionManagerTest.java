package com.project.mysubscriptiontest;


import com.project.mysubscription.SubscriptionManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;


public class SubscriptionManagerTest {
    @Test
    void testGetSubscriptions() {
        SubscriptionManager subscriptionManager = new SubscriptionManager();
        ArrayList<ArrayList<String>> combinations = subscriptionManager.getCombinations(35);
        Assert.assertEquals(2,combinations.size());
    }
    @Test
    void testGetSubscriptionsTwo() {
        SubscriptionManager subscriptionManager = new SubscriptionManager();
        ArrayList<ArrayList<String>> combinations = subscriptionManager.getCombinations(40);
        Assert.assertEquals(4,combinations.size());

    }
    @Test
    void testTotalPrice() {
        SubscriptionManager subscription = new SubscriptionManager();
        HashMap<String,Double> subscriptionDetails = subscription.getSubscriptionDetails();
        Assert.assertEquals(subscriptionDetails.get("TOI"),26.0);
        Assert.assertEquals(subscriptionDetails.get("Hindu"),20.5);
        Assert.assertEquals(subscriptionDetails.get("ET"),34.0);
        Assert.assertEquals(subscriptionDetails.get("BM"),10.5);
        Assert.assertEquals(subscriptionDetails.get("HT"),18.0);
    }
}

