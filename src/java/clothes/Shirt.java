package clothes;

import modell.Gender;
import modell.Quality;

public class Shirt extends Clothes {

    boolean isLongSleeves;

    public Shirt() {
    }

    public Shirt(String name, Gender genderType, Quality qualityMark, boolean isLongSleeves) {
        super(name, genderType, qualityMark);
        this.isLongSleeves = isLongSleeves;
    }

    public boolean isLongSleeves() {
        return isLongSleeves;
    }

    public void setLongSleeves(boolean longSleeves) {
        isLongSleeves = longSleeves;
    }
}
