package service;
import algorithm.BundleAlgorithm;
import algorithm.FileMatchWithInput;
import model.*;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Scanner;

public class BoundleCalculator {
    private static final Logger LOGGER = Logger.getLogger(BoundleCalculator.class);
    BrandName brandName = new BrandName();
    OrderItem orderItem = new OrderItem();
    OrderParser orderParser = new OrderParser();
    BundleAlgorithm bundleAlgorithm = new BundleAlgorithm();
    ArrayList<Integer> arrayList = new ArrayList<>();
    FileMatchWithInput fileMatchWithInput = new FileMatchWithInput();
    ArrayList<Integer> finalArrayList = new ArrayList<>();
    PriceFiller priceFiller = new PriceFiller();

    public void getBrandAndOrder(){

        boolean isFlag = true;
        while(isFlag) {
            LOGGER.info("Please input the brand name like IMG(Image), FLAC(Audio) and VID(Video) and Item number");
            LOGGER.info("The format like IMG/10");
            orderParser.getUserInput();
            orderItem = orderParser.getOrderItems();
            brandName = orderParser.getOi();
            arrayList = bundleAlgorithm.getFormat(brandName);
            finalArrayList = fileMatchWithInput.testDataInput2(orderItem, arrayList);
            priceFiller.showResult(finalArrayList, brandName, orderItem);
            LOGGER.info("Do you wish to continue? press 1 to stop, press other keys to continue.");

            Scanner console = new Scanner(System.in);
            String userInput = console.nextLine();
            if(userInput.equalsIgnoreCase("1")){
                isFlag = false;
            }
        }
    }
    }

