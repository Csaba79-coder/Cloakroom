package module;

import utils.FileHandler;

import java.io.IOException;

public class Processor {

    public Processor() {
    }

    public static void run() {

        try {
            // FileHandler.read();
            FileHandler.readToMap();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
