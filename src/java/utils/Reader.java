package utils;

import clothes.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {


    private final List<Shirt> SHIRTS = new ArrayList<>();
    private final List<TShirt> T_SHIRTS = new ArrayList<>();
    private final List<Pants>  PANTS = new ArrayList<>();
    private final List<Jacket> JACKETS = new ArrayList<>();
    private final List<Shoes> SHOES = new ArrayList<>();
    private final List<Socks> SOCKS = new ArrayList<>();

    public Reader() {
    }

    public static void Buffer(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        for (String line; (line = bufferedReader.readLine()) != null; ) {
            String[] parts = line.split(",");
            // TODO creat lists (instantiaton!!!)
            // STUDENTS.add(new Students(parts[0], parts[1], Integer.parseInt(parts[2])));
            // System.out.println(line);
        }
    }

    public List<Shirt> getShirts() {
        return SHIRTS;
    }

    public List<TShirt> gettShirts() {
        return T_SHIRTS;
    }

    public List<Pants> getPants() { return PANTS;}

    public List<Jacket> getJackets() {return JACKETS; }

    public List<Shoes> getShoes() { return SHOES; }

    public List<Socks> getSocks() { return SOCKS; }

    public static void printShirts(List<Shirt> SHIRTS) {
        SHIRTS.stream().forEach(System.out::println);
    }

    public void printTShirts() {
        T_SHIRTS.stream().forEach(System.out::println);
    }

    public void printPants() {
        PANTS.stream().forEach(System.out::println);
    }

    public void printJackets() {
        JACKETS.stream().forEach(System.out::println);
    }

    public void printShoes() {
        SHOES.stream().forEach(System.out::println);
    }

    // getSocks().size();
    // getJackets().get(i);
    public void printSocks() {
        SOCKS.stream().forEach(System.out::println);
    }
}
