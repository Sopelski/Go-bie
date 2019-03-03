package pl.saltsoft;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class NewReader {

    void readLinesFromFile(String filePath) throws Exception {
        File file = new File(filePath);
        FileReader r = new FileReader(file);
        BufferedReader br = new BufferedReader(r);
        String st = br.readLine();
        while (st != null) {
            System.out.println(st);
            st = br.readLine();
        }
    }
}
