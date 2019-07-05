package service;

import model.BrandName;
import model.OrderItem;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class PriceFiller {
    private static final Logger LOGGER = Logger.getLogger(BoundleCalculator.class);

    public void showResult(ArrayList arr, BrandName brandName, OrderItem orderItem) {
        if (brandName.getItemName().equalsIgnoreCase("IMG")) {
            IMG(arr, orderItem);
        }
        if (brandName.getItemName().equalsIgnoreCase("FLAC")) {
            FLAC(arr, orderItem);
        }
        if (brandName.getItemName().equalsIgnoreCase("VID")) {
            VID(arr, orderItem);
        }
    }

    public void IMG(ArrayList arrayList, OrderItem orderItem ){
        int i5 = 0;
        int i10 = 0;
        ArrayList<Integer> temp = arrayList;
        double total = 0;
        for(int i=0; i<temp.size(); i++) {
            if(temp.get(i)==5) {
                i5++;
                total+=450;
            }
            if(temp.get(i)==10) {
                i10++;
                total+=800;
            }
        }
        System.out.println(orderItem.getOrderItem()+" IMG"+ " $"+total);
        if(i5>0) {
            System.out.println("$" + 450 + " " + i5 + " * " + 5);
        }
        if(i10>0) {
            System.out.println("$" + 800 + " " + i10 + " * " + 10);
        }

    }

    public void FLAC(ArrayList arrayList, OrderItem orderItem ){
        int i3 = 0;
        int i6 = 0;
        int i9 = 0;
        ArrayList<Integer> temp = arrayList;
        double total = 0;
        for(int i=0; i<temp.size(); i++) {
            if(temp.get(i)==3) {
                i3++;
                total+=427.50;
            }
            if(temp.get(i)==6) {
                i6++;
                total+=810;
            }
            if(temp.get(i)==9) {
                i9++;
                total+=1147.50;
            }
        }
        System.out.println(orderItem.getOrderItem()+" FLAC"+ " $"+total);
        if(i3>0){
            System.out.println("$"+427.50+" "+i3+" * "+3);
        }
        if(i6>0){
            System.out.println("$"+810+" "+i6+" * "+6);
        }
        if(i9>0){
            System.out.println("$"+1147.50+" "+i9+" * "+9);

        }
    }

    public void VID(ArrayList arrayList, OrderItem orderItem ){
        int i3 = 0;
        int i5 = 0;
        int i9 = 0;
        ArrayList<Integer> temp = arrayList;
        double total = 0;
        for(int i=0; i<temp.size(); i++) {
            if(temp.get(i)==3) {
                i3++;
                total+=570;
            }
            if(temp.get(i)==5) {
                i5++;
                total+=900;
            }
            if(temp.get(i)==9) {
                i9++;
                total+=1530;
            }
        }
        System.out.println(orderItem.getOrderItem()+" VID"+ " $"+total);

        if(i3>0){
            System.out.println("$"+570+" "+ i3 +" * "+3);
        }
        if(i5>0){
            System.out.println("$"+900+" "+i5+" * "+5);
        }
        if(i9>0){
            System.out.println("$"+1530+" "+i9+" * "+9);
        }
    }

}
