package algorithm;

import model.OrderItem;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class FileMatchWithInputTest {
    private FileMatchWithInput fileMatchWithInput;
    private OrderItem orderItem;

    @Before
    public void setup(){
        fileMatchWithInput = new FileMatchWithInput();
        orderItem = new OrderItem();
    }
    @Test
    public void testBundleCalculator1(){
        ArrayList<Integer> newArray = new ArrayList<>();
        newArray.add(5);
        newArray.add(10);

        ArrayList<Integer> resultArray = new ArrayList<>();
        resultArray.add(10);



        orderItem.setOrderItem(10);
        assertEquals(resultArray, fileMatchWithInput.testDataInput2(orderItem,newArray));
    }
    @Test
    public void testBundleCalculator2(){
        ArrayList<Integer> newArray = new ArrayList<>();
        newArray.add(3);
        newArray.add(5);
        newArray.add(9);

        ArrayList<Integer> resultArray = new ArrayList<>();
        resultArray.add(9);
        resultArray.add(5);
        resultArray.add(3);


        orderItem.setOrderItem(17);

        assertEquals(resultArray, fileMatchWithInput.testDataInput2(orderItem,newArray));
    }

    @Test
    public void testBundleCalculator3(){
        ArrayList<Integer> newArray = new ArrayList<>();
        newArray.add(3);
        newArray.add(5);
        newArray.add(9);

        ArrayList<Integer> resultArray = new ArrayList<>();
        resultArray.add(9);
        resultArray.add(9);


        orderItem.setOrderItem(18);

        assertEquals(resultArray, fileMatchWithInput.testDataInput2(orderItem,newArray));
    }
    @Test
    public void testBundleCalculator4(){
        ArrayList<Integer> newArray = new ArrayList<>();
        newArray.add(3);
        newArray.add(6);
        newArray.add(9);

        ArrayList<Integer> resultArray = new ArrayList<>();
        resultArray.add(9);
        resultArray.add(9);
        resultArray.add(9);


        orderItem.setOrderItem(27);

        assertEquals(resultArray, fileMatchWithInput.testDataInput2(orderItem,newArray));
    }
    @Test
    public void testBundleCalculator5(){
        ArrayList<Integer> newArray = new ArrayList<>();
        newArray.add(3);
        newArray.add(6);
        newArray.add(9);

        ArrayList<Integer> resultArray = new ArrayList<>();
        resultArray.add(9);
        resultArray.add(3);


        orderItem.setOrderItem(12);

        assertEquals(resultArray, fileMatchWithInput.testDataInput2(orderItem,newArray));
    }

}