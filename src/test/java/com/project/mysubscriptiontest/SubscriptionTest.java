package com.project.mysubscriptiontest;

import com.project.mysubscription.Subscription;
import org.testng.Assert;
import org.testng.annotations.Test;




public class SubscriptionTest {
    @Test
    public void testTotalPrice(){
        Subscription subscription = new Subscription();
        double total = subscription.calculateTotalPrice(new double[] {3, 3, 3, 3, 3, 5, 6});
        Assert.assertEquals(26.0,total);


    }


}