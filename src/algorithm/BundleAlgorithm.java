package algorithm;
import model.FormatFile;
import java.util.ArrayList;
import model.BrandName;

public class BundleAlgorithm {
    FormatFile formatFile = new FormatFile();
    ArrayList<String> medias = null;
    ArrayList<Integer> boundleArrayList = null;
    String ho = "";

    public ArrayList getFormat(BrandName brandName){
        String i = brandName.getItemName();
        formatFile.readAndWriteCharToFile();
        medias = formatFile.getArrayList();
        for(String s: medias){
            if(s.substring(0,i.length()).equalsIgnoreCase(i)){
                ho = s;
            }
        }
        boundleArrayList = transformFormat(ho);
        return boundleArrayList;
    }
    public ArrayList transformFormat(String s){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        String parts[] = ho.split(",");
        for(String b: parts){
            if(isInteger(b)){
                int n = Integer.valueOf(b);
                temp.add(n);
            }
            }
        return temp;
        }
    public boolean isInteger( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }

}


