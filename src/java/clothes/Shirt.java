package clothes;

public class Shirt extends Clothes {

    boolean isLongSleeves;

    public Shirt() {
    }

    public Shirt(String[] parts) {
        this(parts[0], parts[1], parts[2], parts[3]);
    }

    public Shirt(String name, String genderType, String qualityMark, String isLongSleeves) {
        super(name, genderType, qualityMark);
        this.isLongSleeves = transformIsLongSleevesFromString(isLongSleeves);
    }

    public boolean transformIsLongSleevesFromString(String isLongSleeves) {
        if (isLongSleeves.equals("igen")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLongSleeves() {
        return isLongSleeves;
    }

    public void setLongSleeves(boolean longSleeves) {
        isLongSleeves = longSleeves;
    }
}
