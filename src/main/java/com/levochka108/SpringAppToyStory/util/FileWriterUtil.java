package com.levochka108.SpringAppToyStory.util;

import java.io.IOException;
import java.io.FileWriter;

public class FileWriterUtil implements FileWriterService {
    private String filePath;

    public FileWriterUtil(String filePath){
        this.filePath = filePath;
    }


    @Override
    public void writerToFile(String data) throws IOException {
        FileWriter writer = new FileWriter(filePath, true);
        writer.write(data + "\n");
        writer.close();
    }
}
