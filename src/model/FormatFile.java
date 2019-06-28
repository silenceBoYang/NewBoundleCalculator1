package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FormatFile {
    ArrayList<String> medias = null;

    public void readAndWriteCharToFile() {
        medias = new ArrayList<>();
        File readFile = new File("src/formatCode.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(readFile))) {
            for (String line; (line = br.readLine()) != null; ) {
                medias.add(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public ArrayList<String> getArrayList(){
        return medias;
    }
}
