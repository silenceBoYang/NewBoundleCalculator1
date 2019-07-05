package service;
import java.util.*;
public class BrandNameFiller {
    public Boolean fillOrderItem(String userInput){
        boolean isFlag;
          if(userInput.equalsIgnoreCase( "IMG")||userInput.equalsIgnoreCase( "Flac")||userInput.equalsIgnoreCase( "VID")){
              isFlag = true;
          }else{
              isFlag = false;
          }

        return isFlag;
    }
}
