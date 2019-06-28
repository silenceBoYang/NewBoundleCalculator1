package service;
import java.util.*;
import model.*;
public class OrderParser {
    BrandNameFiller olf = new BrandNameFiller();
    BrandName oi = new model.BrandName();
    OrderItem orderItems = new OrderItem();
//    OrderNumFiller onf = new OrderNumFiller();


    public void getUserInput(){
        System.out.println("Please input the brand name like IMG(Image), FLAC(Audio) and VID(Video)");

        Scanner console = new Scanner(System.in);
        String orderItem = olf.fillOrderItem(console.nextLine());
        oi.setItemName(orderItem);


        System.out.println("Please input the item number");
        Scanner console2 = new Scanner(System.in);
        int number = 0;
        boolean isNumber = false;
        do{
            if(console2.hasNextInt()){
                number = console2.nextInt();
                if(number == 0){
                    System.out.println("The number cannot be 0");
                    isNumber = false;
                }else {
                    isNumber = true;
                }
            }
            else{
                System.out.println("Please enter a integer");
                isNumber = false;
                console2.next();
            }
        }while(!(isNumber));
        orderItems.setOrderItem(number);
    }
    public OrderItem getOrderItems(){
        return orderItems;
    }
    public BrandName getOi(){
        return oi;
    }
}
