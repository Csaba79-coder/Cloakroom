package utils;

import clothes.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileHandler {

    private static final String RELATIVE_PATH = "src/resources/clothes.txt"; // src/resources/clothes.txt
    private static final String RELATIVE_PATH_FOR_TEST = "src/resources/test.txt";

    private static List<Shirt> shirtsList = new ArrayList<>();
    private static List<TShirt> tShirtsList = new ArrayList<>();
    private static List<Pants> pantsList = new ArrayList<>();
    private static List<Jacket> jacketList = new ArrayList<>();
    private static List<Shoes> shoesList = new ArrayList<>();
    private static List<Socks> socksList = new ArrayList<>();

    public static Map<String, List<Clothes>> clothesListHashMap = new HashMap<>();

    public static void read() throws IOException {
        FileReader fileReader = new FileReader(RELATIVE_PATH_FOR_TEST);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        for (String line; (line = bufferedReader.readLine()) != null; ) {
            String[] parts = line.split(",");
            if ("póló".contains(parts[0])) {
                tShirtsList.add(new TShirt(parts[0], parts[1], parts[2], parts[3], parts[4]));
            } else if (parts[0].equals("ing")) {
                shirtsList.add(new Shirt(parts[0], parts[1], parts[2], parts[3]));
            } else if (parts[0].equals("nadrág")) {
                pantsList.add(new Pants(parts[0], parts[1], parts[2], parts[3]));
            } else if ((parts[0].equals("kabát"))) {
                jacketList.add(new Jacket(parts[0], parts[1], parts[2], parts[3]));
            } else if ((parts[0].equals("cipő"))) {
                shoesList.add(new Shoes(parts[0], parts[1], parts[2], parts[3]));
            } else if ((parts[0].equals("zokni"))) {
                socksList.add(new Socks(parts[0], parts[1], parts[2], parts[3]));
            }
            // System.out.println(line);
        }
    }

    public static void readToMap() throws IOException {
        FileReader fileReader = new FileReader(RELATIVE_PATH_FOR_TEST);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        for (String line; (line = bufferedReader.readLine()) != null;) {
            Clothes currentClothes = new Clothes(line.split(","));
            clothesListHashMap.putIfAbsent(currentClothes.getName(), new ArrayList<>());
            clothesListHashMap.get(currentClothes.getName()).add(currentClothes);
        }
    }

    public static void printMap(Map<String, List<Clothes>> clothesListHashMap) {
        for (List<Clothes> clothesList : clothesListHashMap.values()) {
            for (Clothes clothes : clothesList) {
                System.out.println(clothes.getName() + ": " +clothes.getQualityMark().QUALITY_MARK);
            }
        }
    }

    public static void printTShirtList(List<TShirt> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + ": " + list.get(i).getColor());
        }
    }

    public static List<Shirt> getShirtsList() {
        return shirtsList;
    }

    public static void setShirtsList(List<Shirt> shirtsList) {
        FileHandler.shirtsList = shirtsList;
    }

    public static List<TShirt> getTShirtsList() {
        return tShirtsList;
    }

    public static void settShirtsList(List<TShirt> tShirtsList) {
        FileHandler.tShirtsList = tShirtsList;
    }

    public static List<Pants> getPantsList() {
        return pantsList;
    }

    public static void setPantsList(List<Pants> pantsList) {
        FileHandler.pantsList = pantsList;
    }

    public static List<Jacket> getJacketList() {
        return jacketList;
    }

    public static void setJacketList(List<Jacket> jacketList) {
        FileHandler.jacketList = jacketList;
    }

    public static List<Shoes> getShoesList() {
        return shoesList;
    }

    public static void setShoesList(List<Shoes> shoesList) {
        FileHandler.shoesList = shoesList;
    }

    public static List<Socks> getSocksList() {
        return socksList;
    }

    public static void setSocksList(List<Socks> socksList) {
        FileHandler.socksList = socksList;
    }
}
