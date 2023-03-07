package com.project.mysubscriptiontest;

import com.project.mysubscription.NewsPaper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewspaperTest {
    @Test
    public void testGetName() {
        NewsPaper newspaper = new NewsPaper("TOI", new double[]{3, 3, 3, 3, 3, 5, 6});
        Assert.assertEquals("TOI", newspaper.getName());
    }

    @Test
    public void testPricesListSize() {
        NewsPaper newspaper = new NewsPaper("TOI", new double[]{3, 3, 3, 3, 3, 5, 6});
        Assert.assertEquals(7, newspaper.getPrice().length);

   }
}
