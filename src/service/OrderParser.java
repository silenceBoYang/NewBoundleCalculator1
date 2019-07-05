package service;
import java.util.*;
import model.*;
import org.apache.log4j.Logger;

public class OrderParser {
    private static final Logger LOGGER = Logger.getLogger(BoundleCalculator.class);

    BrandNameFiller brandNameFiller = new BrandNameFiller();
    BrandName brandName = new model.BrandName();
    OrderItem orderItems = new OrderItem();
    OrderItemFiller orderItemFiller = new OrderItemFiller();
//    OrderNumFiller onf = new OrderNumFiller();


    public void getUserInput(){
        boolean isFlag = true;
        boolean isBrand;
        boolean isNum;
        while(isFlag) {
            Scanner console = new Scanner(System.in);
            String input = console.nextLine();
            if (input.contains("/")) {
                String[] parts = input.split("/", 2);
                isBrand = brandNameFiller.fillOrderItem(parts[0]);
                isNum = orderItemFiller.isInteger(parts[1]);
                if(isBrand == true && isNum == true){
                    brandName.setItemName(parts[0]);
                    orderItems.setOrderItem(Integer.valueOf(parts[1]));
                    isFlag = false;
                }else{
                    LOGGER.info("Please input the correct brand name and the item number must be greater than 0 ");
                }
            }else{
                LOGGER.info("Please input / between brand and order number");
            }
        }
    }
    public OrderItem getOrderItems(){
        return orderItems;
    }
    public BrandName getOi(){
        return brandName;
    }
}
