package service;
import algorithm.BundleAlgorithm;
import algorithm.FileMatchWithInput;
import model.*;

import java.util.ArrayList;

public class BoundleCalculator {
    BrandName brandName = new BrandName();
    OrderItem orderItem = new OrderItem();
    OrderParser orderParser = new OrderParser();
    BundleAlgorithm bundleAlgorithm = new BundleAlgorithm();
    ArrayList<Integer> arrayList = new ArrayList<>();
    FileMatchWithInput fileMatchWithInput = new FileMatchWithInput();
    ArrayList<Integer> finalArrayList = new ArrayList<>();
    PriceFiller priceFiller = new PriceFiller();

    public void getBrandAndOrder(){
        orderParser.getUserInput();
        orderItem = orderParser.getOrderItems();
        brandName = orderParser.getOi();
        arrayList = bundleAlgorithm.getFormat(brandName);
        finalArrayList =  fileMatchWithInput.testDataInput2(orderItem, arrayList);
        priceFiller.showResult(finalArrayList, brandName, orderItem );
    }
    }

