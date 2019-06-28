package algorithm;

import model.OrderItem;

import java.util.*;
import java.util.Collections;

public class FileMatchWithInput {

    public ArrayList testDataInput2(OrderItem orderItem, ArrayList<Integer> newArray) {
        Collections.sort(newArray);
        Collections.reverse(newArray);
        ArrayList<Integer> tempList = new ArrayList<>();
        ArrayList<Integer> tempList1 = new ArrayList<>();
        int another = orderItem.getOrderItem();
        int totalNumber = 0;
        int h = 0;
        while (h<newArray.size()) {
            totalNumber = orderItem.getOrderItem();
            tempList1.clear();
            tempList.clear();
            for(int r=h; r<newArray.size();r++){
                tempList1.add(newArray.get(r));
            }
            for (int i = 0; i < tempList1.size(); i++) {
                int temp = totalNumber / tempList1.get(i);
                if (temp > 0) {
                    for (int j = 0; j < temp; j++) {
                        tempList.add(tempList1.get(i));
                    }
                    totalNumber = totalNumber - tempList1.get(i) * temp;
                }
            }
            int sum=0;
            for(int g=0; g<tempList.size();g++){
                sum += tempList.get(g);
            }
            if(sum==another){
                break;
            }
            h++;
        }
        int sums=0;
        for(int g=0; g<tempList.size();g++){

            sums += tempList.get(g);

        }
        if (sums< another) {
            tempList.add(tempList1.get(tempList1.size() - 1));
        }

     return tempList;
    }
    }




