package service;

public class OrderItemFiller {
    public boolean isInteger( String input ) {
        boolean isNum = false;
        try {
            if(Integer.parseInt( input )>0) {

                isNum = true;
            }
        }
        catch( Exception e ) {
            isNum = false;
        }
        return isNum;
    }
}
