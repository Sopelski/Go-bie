package pl.saltsoft;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class NewWriter {

    void writeFile(String filePath) throws Exception {
        File file = new File(filePath);
        FileWriter w = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(w);

        bw.write("Taco");
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
