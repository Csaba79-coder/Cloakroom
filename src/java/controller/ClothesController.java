package controller;

import clothes.*;

import java.util.*;

public class ClothesController {

    
    public int countItems(Map<String, List<Clothes>> clothesListHashMap, String clothes) {
        int i = 0;
        if (i < clothesListHashMap.size()) {
            do {
                int counterKeep = 0;
                for (int j = 0; j < clothesListHashMap.get(clothes).size(); j++) {
                    counterKeep++;
                }
                return counterKeep;
            } while (i < clothesListHashMap.size());
        }
        return -1;
    }

    public int collectItemsByItemsByQualityMark(List<Clothes> clothesList) {
        List<String> tempFinal = new ArrayList<>();
        for (Clothes clothesItem : clothesList) {
            if (clothesItem.getQualityMark().QUALITY_MARK.equals(1) || clothesItem.getQualityMark().QUALITY_MARK.equals(2)) {
                tempFinal.add(clothesItem.getName());
            }
        }
        return tempFinal.size();
    }

    public int collectItemsByItemsByQualityMark(Map<String, List<Clothes>> clothesListHashMap) {
        List<String> tempFinal = new ArrayList<>();
        for (List<Clothes> clothesList : clothesListHashMap.values()) {
            for (Clothes clothesItem : clothesList) {
                if (clothesItem.getQualityMark().QUALITY_MARK.equals(1) || clothesItem.getQualityMark().QUALITY_MARK.equals(2)) {
                    tempFinal.add(clothesItem.getName());
                }
            }
        }
        return tempFinal.size();
    }

    public int countRemainingTShirts(List<TShirt> tShirtsList) {
        int counter = 0;
        List<String> tempList = new ArrayList<>();
        for (int i = 0; i < tShirtsList.size(); i++) {
            if (tShirtsList.get(i).getQualityMark().QUALITY_MARK.equals(1) || tShirtsList.get(i).getQualityMark().QUALITY_MARK.equals(2)) {
                tempList.add(tShirtsList.get(i).getName());
            }
        }
        for (int i = 0; i < tempList.size(); i++) {
            counter++;
        }
        return counter;
    }

    public int countRemainingShirts(List<Shirt> shirtsList) {
        int counter = 0;
        List<String> tempList = new ArrayList<>();
        for (int i = 0; i < shirtsList.size(); i++) {
            if (shirtsList.get(i).getQualityMark().QUALITY_MARK.equals(1) || shirtsList.get(i).getQualityMark().QUALITY_MARK.equals(2)) {
                tempList.add(shirtsList.get(i).getName());
            }
        }
        for (int i = 0; i < tempList.size(); i++) {
            counter++;
        }
        return counter;
    }

    public int countRemainingPants(List<Pants> pantsList) {
        int counter = 0;
        List<String> tempList = new ArrayList<>();
        for (int i = 0; i < pantsList.size(); i++) {
            if (pantsList.get(i).getQualityMark().QUALITY_MARK.equals(1) || pantsList.get(i).getQualityMark().QUALITY_MARK.equals(2)) {
                tempList.add(pantsList.get(i).getName());
            }
        }
        for (int i = 0; i < tempList.size(); i++) {
            counter++;
        }
        return counter;
    }

    public int countRemainingJacket(List<Jacket> jacketList) {
        int counter = 0;
        List<String> tempList = new ArrayList<>();
        for (int i = 0; i < jacketList.size(); i++) {
            if (jacketList.get(i).getQualityMark().QUALITY_MARK.equals(1) || jacketList.get(i).getQualityMark().QUALITY_MARK.equals(2)) {
                tempList.add(jacketList.get(i).getName());
            }
        }
        for (int i = 0; i < tempList.size(); i++) {
            counter++;
        }
        return counter;
    }

    public int countRemainingShoes(List<Shoes> shoesList) {
        int counter = 0;
        List<String> tempList = new ArrayList<>();
        for (int i = 0; i < shoesList.size(); i++) {
            if (shoesList.get(i).getQualityMark().QUALITY_MARK.equals(1) || shoesList.get(i).getQualityMark().QUALITY_MARK.equals(2)) {
                tempList.add(shoesList.get(i).getName());
            }
        }
        for (int i = 0; i < tempList.size(); i++) {
            counter++;
        }
        return counter;
    }

    public int countRemainingSocks(List<Socks> socksList) {
        int counter = 0;
        List<String> tempList = new ArrayList<>();
        for (int i = 0; i < socksList.size(); i++) {
            if (socksList.get(i).getQualityMark().QUALITY_MARK.equals(1) || socksList.get(i).getQualityMark().QUALITY_MARK.equals(2)) {
                tempList.add(socksList.get(i).getName());
            }
        }
        for (int i = 0; i < tempList.size(); i++) {
            counter++;
        }
        return counter;
    }
}