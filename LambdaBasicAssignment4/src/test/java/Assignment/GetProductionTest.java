package Assignment;

import org.junit.Assert;
import org.junit.Test;


public class GetProductionTest {

        GetProductionOfRangeImpl obj = new GetProductionOfRangeImpl();


    @Test
    public void test1()
    {
        long actual = obj.get.getProduct(2,2);
        long expected= 2;
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void test2()
    {
        long actual = obj.get.getProduct(0,1);
        long expected= 0;
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void test3()
    {
        long actual = obj.get.getProduct(1,4);
        long expected= 24;
        Assert.assertEquals(expected,actual);

    }
    /////Negative Test Case as expected value will be 24
    @Test
    public void test4()
    {
        long actual = obj.get.getProduct(1,4);
        long expected= 6;
        Assert.assertNotEquals(expected,actual);

    }



}