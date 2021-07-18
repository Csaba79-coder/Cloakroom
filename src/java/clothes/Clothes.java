package clothes;

import modell.GenderEnum;
import modell.QualityEnum;

public class Clothes {

    String name;
    GenderEnum genderType;
    QualityEnum qualityMark;

    public Clothes() {
    }

    public Clothes(String[] parts) {
        this(parts[0], parts[1], parts[2]);
    }

    public Clothes(String name, String genderType, String qualityMark) {
        this.name = name;
        this.genderType = GenderEnum.getEnumByLabel(genderType);
        this.qualityMark = QualityEnum.getQualityMark(Integer.parseInt(qualityMark));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenderEnum getGenderType() {
        return genderType;
    }

    public void setGenderType(GenderEnum genderType) {
        this.genderType = genderType;
    }

    public QualityEnum getQualityMark() {
        return qualityMark;
    }

    public void setQualityMark(QualityEnum qualityMark) {
        this.qualityMark = qualityMark;
    }
}
