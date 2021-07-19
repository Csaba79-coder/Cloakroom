package module;

import controller.ClothesController;
import utils.FileHandler;
import java.io.IOException;


public class Processor {

    public Processor() {
    }

    public static void run() {

        try {
            FileHandler.read();
            FileHandler.readToMap();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ClothesController clothesController = new ClothesController();

        int sumTShirts = clothesController.countItems(FileHandler.clothesListHashMap, "póló");
        int sumShirts = clothesController.countItems(FileHandler.clothesListHashMap, "ing");
        int sumPants = clothesController.countItems(FileHandler.clothesListHashMap, "nadrág");
        int sumJacket = clothesController.countItems(FileHandler.clothesListHashMap, "kabát");
        int sumShoes = clothesController.countItems(FileHandler.clothesListHashMap, "cipő");
        int sumSocks = clothesController.countItems(FileHandler.clothesListHashMap, "zokni");
        int sum = (sumTShirts + sumShirts + sumPants + sumJacket + sumShoes + sumSocks);

        System.out.println(("I have all together " + sumTShirts + " T-shirts, "
                + sumShirts + " shirts, "
                + sumPants + " pants, "
                + sumJacket + " jackets, "
                + sumShoes + " shoes, "
                + sumSocks + " socks."
                + " That's altogether " + sum + " clothes!"));

        int sumRemainingTShirts = clothesController.countRemainingTShirts(FileHandler.getTShirtsList());
        int sumRemainingShirts = clothesController.countRemainingShirts(FileHandler.getShirtsList());
        int sumRemainingPants = clothesController.countRemainingPants(FileHandler.getPantsList());
        int sumRemainingJacket = clothesController.countRemainingJacket(FileHandler.getJacketList());
        int sumRemainingShoes = clothesController.countRemainingShoes(FileHandler.getShoesList());
        int sumRemainingSocks = clothesController.countRemainingSocks(FileHandler.getSocksList());

        int sumAllRemainingStuffs = (sumRemainingShirts + sumRemainingTShirts + sumRemainingPants +
                sumRemainingJacket + sumRemainingSocks + sumRemainingShoes);

        System.out.println("Remaining T-shirts (quality mark as: 1 or 2): " + sumRemainingTShirts);
        System.out.println("Remaining shirts (quality mark as: 1 or 2): " + sumRemainingShirts);
        System.out.println("Remaining pants (quality mark as: 1 or 2): " + sumRemainingPants);
        System.out.println("Remaining jackets (quality mark as: 1 or 2): " + sumRemainingJacket);
        System.out.println("Remaining shoes (quality mark as: 1 or 2): " + sumRemainingShoes);
        System.out.println("Remaining socks (quality mark as: 1 or 2): " + sumRemainingSocks);

        System.out.println("The remained stuffs (mark: 1, 2): " + sumAllRemainingStuffs);

        System.out.println("I donated and throw away from T-shits: " + (sumTShirts - sumRemainingTShirts));
        System.out.println("I donated and throw away from shits: " + (sumShirts - sumRemainingShirts));
        System.out.println("I donated and throw away from pants: " + (sumPants - sumRemainingPants));
        System.out.println("I donated and throw away from jacket: " + (sumJacket - sumRemainingJacket));
        System.out.println("I donated and throw away from shoes: " + (sumShoes - sumRemainingShoes));
        System.out.println("I donated and throw away from socks: " + (sumSocks - sumRemainingSocks));

        System.out.println("I donated and throw away from all stuffs: " + (sum - sumAllRemainingStuffs));

        // int numOfTShirt = clothesController.countItemIteratingThrowMap(FileHandler.clothesListHashMap, "póló");
//        int hope = clothesController.countItemsHashMap(FileHandler.clothesListHashMap, "póló");
//        System.out.println(hope);
    }
}
