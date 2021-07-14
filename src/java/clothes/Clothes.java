package clothes;

import modell.Gender;
import modell.Quality;

public class Clothes {

    String name;
    Gender genderType;
    Quality qualityMark;

    public Clothes() {
    }

    public Clothes(String name, Gender genderType, Quality qualityMark) {
        this.name = name;
        this.genderType = genderType;
        this.qualityMark = qualityMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGenderType() {
        return genderType;
    }

    public void setGenderType(Gender genderType) {
        this.genderType = genderType;
    }

    public Quality getQualityMark() {
        return qualityMark;
    }

    public void setQualityMark(Quality qualityMark) {
        this.qualityMark = qualityMark;
    }
}
