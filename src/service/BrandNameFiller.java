package service;
import java.util.*;
public class BrandNameFiller {
    public String fillOrderItem(String userInput){
        boolean isFlag = true;
        while(isFlag){
          if(userInput.equalsIgnoreCase( "IMG")||userInput.equalsIgnoreCase( "Flac")||userInput.equalsIgnoreCase( "VID")){
              break;
          }else{
              System.out.println("Please enter the right Brand name");
              Scanner console = new Scanner(System.in);
              userInput = console.nextLine();
          }

        }
      return userInput;
    }
}
